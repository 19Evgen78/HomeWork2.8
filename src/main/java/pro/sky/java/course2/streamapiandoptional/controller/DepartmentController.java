package pro.sky.java.course2.streamapiandoptional.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.streamapiandoptional.service.DepartmentService;
import pro.sky.java.course2.streamapiandoptional.model.Employee;
import java.util.List;
import java.util.Map;

@RestController
    @RequestMapping("/departments")
    public class DepartmentController {
        private final DepartmentService departmentService;
        public DepartmentController(DepartmentService departmentService) {
            this.departmentService = departmentService;
        }
        @GetMapping("min-salary")
        public Employee minSalary(@RequestParam("departmentId") int department) {
            return departmentService.minSalary(department);
        }
        @GetMapping("max-salary")
        public Employee maxSalary(@RequestParam("departmentId") int department) {
            return departmentService.maxSalary(department);
        }
        @GetMapping(value ="all", params = "departmentId")
        public List<Employee> printName (@RequestParam("departmentId") int department) {
            return departmentService.getName(department);
        }
        @GetMapping("all")
        public Map<Integer, List<Employee>> printNameByDepartment () {
            return departmentService.printNameByDepartment();
        }

    }