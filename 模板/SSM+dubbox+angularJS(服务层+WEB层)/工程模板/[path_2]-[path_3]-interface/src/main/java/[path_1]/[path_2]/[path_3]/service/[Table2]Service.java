package [package].service;
import java.util.List;
import [path_1].[path_2].[path_3].pojo.[Table2];

import com.easylinking.color.util.PageResult;
/**
 * [comment]服务层接口
 * @author Administrator
 *
 */
public interface [Table2]Service {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<[Table2]> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add([Table2] [table2]);
	
	
	/**
	 * 修改
	 */
	public void update([Table2] [table2]);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public [Table2] findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage([Table2] [table2], int pageNum,int pageSize);
	
}
