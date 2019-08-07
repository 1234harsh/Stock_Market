package com.cognizant.pts.controller;


import controller.AdminModel;
import controller.AdminService;
import controller.Autowired;
import controller.Controller;
import controller.Errors;
import controller.ModelAndView;
import controller.ModelAttribute;
import controller.RequestMapping;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="doLogin.htm",method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user")UserModel userModel,Errors error)
	{
		ModelAndView mv=new ModelAndView();
		
		if(error.hasErrors())
		{
			mv.setViewName("home");
		}
		else{
		int checkUserLogin=userService.doLogin(userModel);
		if(checkUserLogin==3)
		{	
			mv.addObject("status","login Successful");
			mv.setViewName("afterlogin");
		}
		else
		{
			mv.addObject("status","login Denied");
			mv.setViewName("home");
		}
		}
		return mv;
	}
	
}
