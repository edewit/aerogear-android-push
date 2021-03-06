/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.android.unifiedpush.metrics;

import android.os.Bundle;
import org.jboss.aerogear.android.unifiedpush.gcm.UnifiedPushMessage;

public class UnifiedPushMetricsMessage implements MetricsMessage {

    private final String messageId;

    public UnifiedPushMetricsMessage(Bundle bundle) {
        this.messageId = bundle.getString(UnifiedPushMessage.PUSH_MESSAGE_ID);
    }

    public UnifiedPushMetricsMessage(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String getMessageId() {
        return this.messageId;
    }

}
