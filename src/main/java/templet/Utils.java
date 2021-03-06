package templet;

/**
 * 工具集
 *
 * @author Administrator
 */
public class Utils {

    /**
     * 首字母大写
     *
     * @param str
     * @return
     */
    public static String getClassName(String str) {
//		String[] array = str.split("_");
//		StringBuilder stringBuilder= new StringBuilder();
//		for (int i=0;i<array.length;i++){
//			stringBuilder.append(array[i].substring(0,1).toUpperCase()).append(array[i].substring(1));
//		}
//		return stringBuilder.toString();
        String s0 = str.substring(0, 1).toUpperCase();
        return s0 + str.substring(1);
    }

    /**
     * 表名转为类名,如t_table变为TTable
     *
     * @param str
     * @return
     */
    public static String getClassNameFromTableName(String str) {
		String[] array = str.split("_");
		StringBuilder stringBuilder= new StringBuilder();
		for (int i=0;i<array.length;i++){
			stringBuilder.append(array[i].substring(0,1).toUpperCase()).append(array[i].substring(1));
		}
		return stringBuilder.toString();
    }

    /**
     * 去掉表名前缀
     *
     * @param tableName
     * @return
     */
    public static String getTableName2(String tableName) {

        tableName = tableName.toLowerCase();//全部转换为小写
        int index = tableName.indexOf("_");//下划线的位置
        if (index == -1) {
            return tableName;
        }
        String name = tableName.substring(index + 1);//从下划线开始截取

        return getColumnName2(name);//去掉下划线
    }


    /**
     * 列名下划线处理
     *
     * @param
     * @return
     */
    public static String getColumnName2(String name) {

        while (true) {

            int i = name.indexOf("_");//取下划线
            System.out.println("i=" + i);
            if (i == -1) {
                break;//跳出
            }
            String n = name.substring(i + 1, i + 2).toUpperCase();//取出需要转换的字母进行转换

            name = name.substring(0, i) + n + name.substring(i + 2);

        }
        return name;
    }


}
