package com.edu.seiryo.coontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.seiryo.dao.DepartmentDao;
import com.edu.seiryo.dao.EmployeeDao;
import com.edu.seiryo.entity.Employee;

@Controller
@RequestMapping("empController")
public class EmpController {
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	DepartmentDao departmentDao;
	
	@RequestMapping("/queryAll")
	public String queryAll(Model model) {
		model.addAttribute("emps", employeeDao.getAll());
		return "main";
	}
	
	@RequestMapping(value="/emp",method = RequestMethod.POST)
	public String add(Employee employee) {
        employeeDao.save(employee);
		return "redirect:/empController/queryAll";
	}
	
	@RequestMapping(value="/emp",method = RequestMethod.GET)
	public String queryDe(Model model) {
		model.addAttribute("emp",new Employee());
		model.addAttribute("department", departmentDao.getDepartments());
		return "input";
	}
	
	@RequestMapping(value="/emp/{id}",method = RequestMethod.GET)
	public String queryById(Model model,@PathVariable("id")Integer id) {
		model.addAttribute("emp",employeeDao.get(id));
		model.addAttribute("department", departmentDao.getDepartments());
		return "input";
	}
	
	@RequestMapping(value="/emp",method = RequestMethod.PUT)
	public String update(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/empController/queryAll";
	}
	
	@RequestMapping(value="/emp/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable("id")Integer id) {
		employeeDao.delete(id);
		return "redirect:/empController/queryAll";
	}
}
