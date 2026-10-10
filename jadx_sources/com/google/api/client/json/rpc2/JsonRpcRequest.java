package com.google.api.client.json.rpc2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class JsonRpcRequest extends GenericData {

    /* JADX INFO: renamed from: id */
    @Key
    private Object f12180id;

    @Key
    private final String jsonrpc = "2.0";

    @Key
    private String method;

    @Key
    private Object params;

    public Object getId() {
        return this.f12180id;
    }

    public String getMethod() {
        return this.method;
    }

    public Object getParameters() {
        return this.params;
    }

    public String getVersion() {
        return "2.0";
    }

    @Override // com.google.api.client.util.GenericData
    public JsonRpcRequest set(String str, Object obj) {
        return (JsonRpcRequest) super.set(str, obj);
    }

    public void setId(Object obj) {
        this.f12180id = obj;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setParameters(Object obj) {
        this.params = obj;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public JsonRpcRequest clone() {
        return (JsonRpcRequest) super.clone();
    }
}
