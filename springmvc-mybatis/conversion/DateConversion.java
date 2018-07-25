package conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 转换日期类型的数据
 * @author ghost
 *
 */
public class DateConversion implements Converter<String, Date>{

	@Override
	public Date convert(String source){
		// TODO Auto-generated method stub
		try{
			if(null != source){
				DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH-mm-ss");
				return df.parse(source);
			}
		}catch(Exception e){
			return null;
		}
		return null;
		
	}

}
