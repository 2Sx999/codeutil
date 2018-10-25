package [package].controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import [path_1].[path_2].[path_3].pojo.[Table2];
import [path_1].[path_2].[path_3].service.[Table2]Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.easylinking.color.util.PageResult;
import com.easylinking.color.util.Result;
/**
 * [comment]controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/[table2]")
public class [Table2]Controller {

	@Autowired
	private [Table2]Service [table2]Service;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@GetMapping("/findAll")
	public List<[Table2]> findAll(){
		return [table2]Service.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@GetMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return [table2]Service.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param [table2]
	 * @return
	 */
	@PostMapping("/add")
	public Result add(@RequestBody [Table2] [table2]){
		try {
			[table2]Service.add([table2]);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param [table2]
	 * @return
	 */
	@PostMapping("/update")
	public Result update(@RequestBody [Table2] [table2]){
		try {
			[table2]Service.update([table2]);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@GetMapping("/findOne")
	public [Table2] findOne(String id){
		return [table2]Service.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@GetMapping("/delete")
	public Result delete(String [] ids){
		try {
			[table2]Service.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@PostMapping("/search")
	public PageResult search(@RequestBody [Table2] [table2], int page, int rows  ){
		return [table2]Service.findPage([table2], page, rows);		
	}
	
}
