package com.tencent.cloud.tuikit.engine.impl.room;

import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeObserver;
import com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUIRoomObserverProxy extends TUIPipelineBridgeObserver {
    private static final String TAG = "TUIRoomObserverProxy";
    private List<TUIRoomObserver> mObserverList = new CopyOnWriteArrayList();
    private HashMap<String, String> mFunctionMap = new HashMap<>();

    public void onReceiveCustomMessageHandler(JSONArray jSONArray) {
        TUIRoomDefine.RoomCustomMessage roomCustomMessageFromJSONObject = ParamsParse.getRoomCustomMessageFromJSONObject((JSONObject) ParamsParse.getParamFromJSONArray(jSONArray, 0, JSONObject.class));
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onReceiveCustomMessage(roomCustomMessageFromJSONObject);
        }
    }

    public void onReceiveTextMessageHandler(JSONArray jSONArray) {
        TUIRoomDefine.RoomTextMessage roomTextMessageFromJSONObject = ParamsParse.getRoomTextMessageFromJSONObject((JSONObject) ParamsParse.getParamFromJSONArray(jSONArray, 0, JSONObject.class));
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onReceiveTextMessage(roomTextMessageFromJSONObject);
        }
    }

    public void onSeatListChangedHandler(JSONArray jSONArray) {
        String str = (String) ParamsParse.getParamFromJSONArray(jSONArray, 0, String.class);
        JSONArray jSONArray2 = (JSONArray) ParamsParse.getParamFromJSONArray(jSONArray, 1, JSONArray.class);
        JSONArray jSONArray3 = (JSONArray) ParamsParse.getParamFromJSONArray(jSONArray, 2, JSONArray.class);
        JSONArray jSONArray4 = (JSONArray) ParamsParse.getParamFromJSONArray(jSONArray, 3, JSONArray.class);
        List<TUIRoomDefine.SeatFullInfo> seatListFromJSONArray = ParamsParse.getSeatListFromJSONArray(jSONArray2);
        List<TUIRoomDefine.UserInfo> userInfoListFromJSONArray = ParamsParse.getUserInfoListFromJSONArray(jSONArray3);
        List<TUIRoomDefine.UserInfo> userInfoListFromJSONArray2 = ParamsParse.getUserInfoListFromJSONArray(jSONArray4);
        Iterator<TUIRoomObserver> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSeatListChanged(str, seatListFromJSONArray, userInfoListFromJSONArray, userInfoListFromJSONArray2);
        }
    }

    private List<TUIRoomObserver> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    public void addObserver(TUIRoomObserver tUIRoomObserver) {
        if (tUIRoomObserver == null || this.mObserverList.contains(tUIRoomObserver)) {
            return;
        }
        this.mObserverList.add(tUIRoomObserver);
    }

    public void destroy() {
        this.mObserverList.clear();
        this.mFunctionMap.clear();
    }

    public void removeObserver(TUIRoomObserver tUIRoomObserver) {
        if (tUIRoomObserver == null || !this.mObserverList.contains(tUIRoomObserver)) {
            return;
        }
        this.mObserverList.remove(tUIRoomObserver);
    }

    public TUIRoomObserverProxy() {
        registerEventHandler();
    }

    private void bindEventHandler(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mFunctionMap.put(str, str2);
        }
    }

    private void registerEventHandler() {
        bindEventHandler("onReceiveTextMessage", "onReceiveTextMessageHandler");
        bindEventHandler("onReceiveCustomMessage", "onReceiveCustomMessageHandler");
        bindEventHandler("onSeatListChanged", "onSeatListChangedHandler");
    }

    @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeObserver
    public void onReceiveEventFromPipeline(String str, String str2) {
        JSONArray jSONArrayStringToJSONArray = ParamsParse.StringToJSONArray(str2);
        if (jSONArrayStringToJSONArray == null) {
            jSONArrayStringToJSONArray = new JSONArray();
        }
        for (Map.Entry<String, String> entry : this.mFunctionMap.entrySet()) {
            if (TextUtils.equals(entry.getKey(), str)) {
                try {
                    TUIRoomObserverProxy.class.getMethod(entry.getValue(), JSONArray.class).invoke(this, jSONArrayStringToJSONArray);
                } catch (Exception unused) {
                }
            }
        }
    }
}
