/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.builder;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/*@Intercepts({
        @Signature(type = Executor.class,method="query",args={MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
})*/
public class ExamplePlugin implements Interceptor {
  private Properties properties;
  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    invocation.getTarget();
    invocation.getMethod();
    invocation.getArgs();
    return invocation.proceed();
  }

  @Override
  public Object plugin(Object target) {
    // 传入目标对象和this，返回代理对象
    return Plugin.wrap(target, this);
  }

  @Override
  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public Properties getProperties() {
    return properties;
  }

}
