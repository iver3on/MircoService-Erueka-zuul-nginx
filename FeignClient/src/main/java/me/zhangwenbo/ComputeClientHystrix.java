package me.zhangwenbo;

import org.springframework.stereotype.Component;


/*创建回调类ComputeClientHystrix，实现@FeignClient的接口，
此时实现的方法就是对应@FeignClient接口中映射的fallback函数。*/
@Component
public class ComputeClientHystrix implements ComputeClient {
	/* (non-Javadoc)
	 * @see me.zhangwenbo.ComputeClient#login(java.lang.String)
	 */
	@Override
	public String login(String loginInfo) {
		return "error,login agin";
	}
}