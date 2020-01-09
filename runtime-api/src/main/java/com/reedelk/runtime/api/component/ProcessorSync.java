package com.reedelk.runtime.api.component;

import com.reedelk.runtime.api.message.FlowContext;
import com.reedelk.runtime.api.message.Message;

public interface ProcessorSync extends Component {

    Message apply(Message message, FlowContext flowContext);

}