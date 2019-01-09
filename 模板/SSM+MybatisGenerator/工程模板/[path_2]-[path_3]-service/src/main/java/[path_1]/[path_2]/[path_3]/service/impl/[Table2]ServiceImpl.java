package [package].service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import [path_1].[path_2].[path_3].mapper.[Table2]Mapper;
import [path_1].[path_2].[path_3].pojo.[Table2];
import [path_1].[path_2].[path_3].pojo.[Table2]Example;
import [path_1].[path_2].[path_3].pojo.[Table2]Example.Criteria;
import [package].service.[Table2]Service;

import com.easylinking.color.util.PageResult;

/**
 * [comment]服务实现层
 * @author Administrator
 *
 */
@Service
public class [Table2]ServiceImpl implements [Table2]Service {

	@Autowired
	private [Table2]Mapper [table2]Mapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<[Table2]> findAll() {
		return [table2]Mapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<[Table2]> page=   (Page<[Table2]>) [table2]Mapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add([Table2] [table2]) {
		[table2]Mapper.insert([table2]);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update([Table2] [table2]){
		[table2]Mapper.updateByPrimaryKey([table2]);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public [Table2] findOne(String id){
		return [table2]Mapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			[table2]Mapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage([Table2] [table2], int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		[Table2]Example example=new [Table2]Example();
		Criteria criteria = example.createCriteria();
		
		if([table2]!=null){			
			<条件查询.String.txt>	
		}
		
		Page<[Table2]> page= (Page<[Table2]>)[table2]Mapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
