package org.apache.lens.server.quota;

/*
 * #%L
 * Lens Server
 * %%
 * Copyright (C) 2014 Apache Software Foundation
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.hive.service.cli.CLIService;
import org.apache.lens.server.LensService;
import org.apache.lens.server.api.quota.QuotaService;


public class QuotaServiceImpl extends LensService implements QuotaService {

  public QuotaServiceImpl(CLIService cliService) {
    super("quota", cliService);
  }

}
