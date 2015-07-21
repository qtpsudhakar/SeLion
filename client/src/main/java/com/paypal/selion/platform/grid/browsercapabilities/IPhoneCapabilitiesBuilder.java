/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2014 PayPal                                                                                          |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/

package com.paypal.selion.platform.grid.browsercapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.paypal.selion.annotations.MobileTest;

/**
 * This class represents the capabilities that are specific to iPhone.
 * @deprecated IPhoneDriver is deprecated in Selenium. Use IOSDriver and {@link MobileTest} instead
 */
class IPhoneCapabilitiesBuilder extends DefaultCapabilitiesBuilder {

    @Override
    public DesiredCapabilities getCapabilities(DesiredCapabilities capabilities) {
        capabilities.setBrowserName(DesiredCapabilities.iphone().getBrowserName());
        return capabilities;
    }
}
