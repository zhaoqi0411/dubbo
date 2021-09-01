package org.apache.dubbo.demo.provider.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author zhaoqi
 * @since 2021-08-24
 * 自动激活的filter
 */
@Activate(group = CommonConstants.PROVIDER_SIDE)
public class ActivateFilter implements Filter {
    /**
     * Make sure call invoker.invoke() in your implementation.
     *
     * @param invoker
     * @param invocation
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("ActivateFilter invoked");
        return invoker.invoke(invocation);
    }
}
