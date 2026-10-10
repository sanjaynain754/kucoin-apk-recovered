package com.sensorsdata.abtest.entity;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class Experiment {
    private static final String TAG = "SAB.Experiment";
    public String experimentGroupId;
    public String experimentId;
    public boolean isControlGroup;
    public boolean isWhiteList;
    public List<Variable> variables;

    public static class Variable {
        public String name;
        public String type;
        public String value;

        public String toString() {
            return "Variable{name='" + this.name + "', value='" + this.value + "', type='" + this.type + "'}";
        }
    }

    public <T> boolean checkTypeIsValid(String str, T t11) {
        if (t11 == null) {
            return true;
        }
        Variable variableByParamName = getVariableByParamName(str);
        if (variableByParamName == null || TextUtils.isEmpty(variableByParamName.type)) {
            SALog.m68589i(TAG, "checkTypeIsValid type is null");
            return false;
        }
        SALog.m68589i(TAG, "checkTypeIsValid params type: " + t11.getClass().toString() + ", experiment type:" + variableByParamName.type);
        String str2 = variableByParamName.type;
        str2.getClass();
        switch (str2) {
            case "STRING":
                return t11 instanceof String;
            case "INTEGER":
                return t11 instanceof Integer;
            case "JSON":
                return t11 instanceof JSONObject;
            case "BOOLEAN":
                return t11 instanceof Boolean;
            default:
                return false;
        }
    }

    public Variable getVariableByParamName(String str) {
        List<Variable> list = this.variables;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (Variable variable : this.variables) {
            if (TextUtils.equals(str, variable.name)) {
                return variable;
            }
        }
        return null;
    }

    public String toString() {
        return "Experiment{experimentId='" + this.experimentId + "', experimentGroupId='" + this.experimentGroupId + "', isControlGroup=" + this.isControlGroup + ", isWhiteList=" + this.isWhiteList + ", variables=" + this.variables + '}';
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public <T> T getVariableValue(String str, T t11) {
        byte b11;
        Variable variableByParamName = getVariableByParamName(str);
        if (variableByParamName != null && !TextUtils.isEmpty(variableByParamName.type)) {
            try {
                if (t11 == null) {
                    String str2 = variableByParamName.type;
                    switch (str2.hashCode()) {
                        case -1838656495:
                            if (str2.equals("STRING")) {
                                b11 = 2;
                            } else {
                                b11 = -1;
                            }
                            break;
                        case -1618932450:
                            if (str2.equals("INTEGER")) {
                                b11 = 0;
                            } else {
                                b11 = -1;
                            }
                            break;
                        case 2286824:
                            if (str2.equals(JsonFactory.FORMAT_NAME_JSON)) {
                                b11 = 3;
                            } else {
                                b11 = -1;
                            }
                            break;
                        case 782694408:
                            if (str2.equals("BOOLEAN")) {
                                b11 = 1;
                            } else {
                                b11 = -1;
                            }
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 != 0) {
                        if (b11 != 1) {
                            if (b11 != 2) {
                                if (b11 == 3) {
                                    try {
                                        return (T) new JSONObject(variableByParamName.value);
                                    } catch (JSONException e11) {
                                        SALog.printStackTrace(e11);
                                    }
                                }
                                return null;
                            }
                            return (T) String.valueOf(variableByParamName.value);
                        }
                        return (T) Boolean.valueOf(Boolean.parseBoolean(variableByParamName.value));
                    }
                    return (T) Integer.valueOf(Integer.parseInt(variableByParamName.value));
                }
                if (t11 instanceof Integer) {
                    return (T) Integer.valueOf(Integer.parseInt(variableByParamName.value));
                }
                if (t11 instanceof Boolean) {
                    return (T) Boolean.valueOf(Boolean.parseBoolean(variableByParamName.value));
                }
                if (t11 instanceof String) {
                    return (T) String.valueOf(variableByParamName.value);
                }
                if (!(t11 instanceof JSONObject)) {
                    return null;
                }
                try {
                    return (T) new JSONObject(variableByParamName.value);
                } catch (JSONException e12) {
                    SALog.printStackTrace(e12);
                    return null;
                }
            } catch (Exception e13) {
                SALog.printStackTrace(e13);
                return null;
            }
            SALog.printStackTrace(e13);
            return null;
        }
        SALog.m68589i(TAG, "getExperimentVariable is null");
        return null;
    }
}
