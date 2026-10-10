package com.tencent.cloud.tuikit.engine.impl.pipelinebridge;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;

/* JADX INFO: loaded from: classes59.dex */
public class TUIPipelineBridgeDefine {

    public interface APICallRespondCallback {
        void onCallback(TUICommonDefine.Error error, String str, String str2);
    }

    public enum PipelineType {
        Room(0),
        Call(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        PipelineType(int i11) {
            this.mValue = i11;
        }
    }
}
