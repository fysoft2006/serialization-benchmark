package de.ruedigermoeller.serialization.testclasses.enterprise.murks.common.special.common.util;

import de.ruedigermoeller.serialization.testclasses.enterprise.ObjectOrientedDataType;
import de.ruedigermoeller.serialization.testclasses.enterprise.ObjectOrientedInt;
import de.ruedigermoeller.serialization.testclasses.enterprise.SimpleOrder;

import java.util.Date;

/**
 Copyright [2014] Ruediger Moeller

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

public class UtilManager extends SimpleOrder {

    public UtilManager() {
    }

    public UtilManager(Date mOrderTime, ObjectOrientedDataType mTradableId, ObjectOrientedDataType mTraderId, ObjectOrientedDataType mBuySell, ObjectOrientedDataType mOrderType, ObjectOrientedInt mOrderQty, ObjectOrientedInt mInitialOrderQty, ObjectOrientedInt mOrderPrc, long mOrderId, ObjectOrientedDataType mText) {
        super(mOrderTime, mTradableId, mTraderId, mBuySell, mOrderType, mOrderQty, mInitialOrderQty, mOrderPrc, mOrderId, mText);
    }
}
