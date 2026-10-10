package com.kubi.home.rank;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import dj.C36716a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RankCardHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/home/rank/RankCardHelper;", "", "<init>", "()V", "trackClick", "", "type", "", ViewProps.POSITION, "trackExpose", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankCardHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25994a = new Companion(null);

    /* JADX INFO: compiled from: RankCardHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/rank/RankCardHelper$Companion;", "", "<init>", "()V", "EXPAND", "", "CLOSE", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m29837a(int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentType", i11);
        jSONObject.put(ViewProps.POSITION, i12);
        Unit unit = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "rankOperate", "1", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public final void m29838b(int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentType", i11);
        jSONObject.put(ViewProps.POSITION, i12);
        Unit unit = Unit.INSTANCE;
        C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "rankOperate", "1", jSONObject);
    }
}
