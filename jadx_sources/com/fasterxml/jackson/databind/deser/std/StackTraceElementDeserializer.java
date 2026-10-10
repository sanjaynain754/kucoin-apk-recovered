package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.kubi.p110rn.RNConstantKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i11, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i11, str4, str5, null);
    }

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i11, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i11);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k != JsonToken.START_OBJECT) {
            if (jsonTokenMo10889k != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.mo10905t0();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.mo10905t0() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        String strMo10869W = null;
        String strMo10869W2 = null;
        String strMo10869W3 = null;
        String strMo10869W4 = "";
        String strMo10869W5 = strMo10869W4;
        String strMo10869W6 = strMo10869W5;
        int iMo10860M = -1;
        while (true) {
            JsonToken jsonTokenMo10907u0 = jsonParser.mo10907u0();
            if (jsonTokenMo10907u0 == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, strMo10869W4, strMo10869W5, strMo10869W6, iMo10860M, strMo10869W, strMo10869W2, strMo10869W3);
            }
            String strMo10887j = jsonParser.mo10887j();
            if ("className".equals(strMo10887j)) {
                strMo10869W4 = jsonParser.mo10869W();
            } else if ("classLoaderName".equals(strMo10887j)) {
                strMo10869W3 = jsonParser.mo10869W();
            } else if ("fileName".equals(strMo10887j)) {
                strMo10869W6 = jsonParser.mo10869W();
            } else if ("lineNumber".equals(strMo10887j)) {
                iMo10860M = jsonTokenMo10907u0.isNumeric() ? jsonParser.mo10860M() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(strMo10887j)) {
                strMo10869W5 = jsonParser.mo10869W();
            } else if (!"nativeMethod".equals(strMo10887j)) {
                if (RNConstantKt.PARAM_MODULE_NAME.equals(strMo10887j)) {
                    strMo10869W = jsonParser.mo10869W();
                } else if ("moduleVersion".equals(strMo10887j)) {
                    strMo10869W2 = jsonParser.mo10869W();
                } else if (!"declaringClass".equals(strMo10887j) && !TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT.equals(strMo10887j)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strMo10887j);
                }
            }
            jsonParser.mo10856C0();
        }
    }
}
