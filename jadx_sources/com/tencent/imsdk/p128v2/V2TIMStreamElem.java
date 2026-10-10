package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.StreamElement;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMStreamElem extends V2TIMElem {
    public String toString() {
        return "V2TIMStreamElem--->markdown:" + getMarkdown() + "isStreamEnded:" + isStreamEnded();
    }

    private String getOwningMsgID() {
        String msgID;
        Message message = getMessage();
        if (message == null || (msgID = message.getMsgID()) == null) {
            return "";
        }
        return msgID;
    }

    private String getOwningStreamMsgID() {
        String streamID;
        if (getElement() == null || (streamID = ((StreamElement) getElement()).getStreamID()) == null) {
            return "";
        }
        return streamID;
    }

    public byte[] getData() {
        if (getElement() == null) {
            return null;
        }
        return ((StreamElement) getElement()).getData();
    }

    public String getMarkdown() {
        if (getElement() == null) {
            return "";
        }
        return ((StreamElement) getElement()).getMarkdown();
    }

    public boolean isStreamEnded() {
        if (getElement() == null) {
            return false;
        }
        return ((StreamElement) getElement()).isStreamEnded();
    }

    public void startTTS(V2TIMTTSVoiceFormat v2TIMTTSVoiceFormat, V2TIMCallback v2TIMCallback) {
        String owningMsgID = getOwningMsgID();
        String owningStreamMsgID = getOwningStreamMsgID();
        if (owningMsgID.isEmpty()) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamElem is not bound to a message");
            }
        } else {
            if (owningStreamMsgID.isEmpty()) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamMsgID is empty, stream may not be ready yet");
                    return;
                }
                return;
            }
            V2TIMMessageManagerImpl.getInstance().internalStartTTS(owningMsgID, owningStreamMsgID, 0, v2TIMTTSVoiceFormat, v2TIMCallback);
        }
    }

    public void stopTTS(V2TIMCallback v2TIMCallback) {
        String owningMsgID = getOwningMsgID();
        String owningStreamMsgID = getOwningStreamMsgID();
        if (owningMsgID.isEmpty()) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamElem is not bound to a message");
            }
        } else {
            if (owningStreamMsgID.isEmpty()) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamMsgID is empty, stream may not be ready yet");
                    return;
                }
                return;
            }
            V2TIMMessageManagerImpl.getInstance().internalStopTTS(owningMsgID, owningStreamMsgID, v2TIMCallback);
        }
    }
}
