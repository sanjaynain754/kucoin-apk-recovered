package com.tencent.rmonitor.common.json;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/json/JsonDispose;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class JsonDispose {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "RMonitor_common_JsonDispose";

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/common/json/JsonDispose$Companion;", "", "()V", "TAG", "", "copyJson", "Lorg/json/JSONObject;", "from", TypedValues.TransitionType.S_TO, "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final JSONObject copyJson(@NotNull JSONObject from, @NotNull JSONObject to2) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to2, "to");
            Iterator<String> itKeys = from.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "from.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    to2.put(next, from.get(next));
                } catch (JSONException e11) {
                    Logger.INSTANCE.mo77131e(JsonDispose.TAG, e11 + ": copy json key " + next + " error");
                }
            }
            return to2;
        }
    }

    @JvmStatic
    @NotNull
    public static final JSONObject copyJson(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        return INSTANCE.copyJson(jSONObject, jSONObject2);
    }
}
