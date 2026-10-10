package com.kubi.event.common;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.event.api.C12573b;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.event.common.a */
/* JADX INFO: compiled from: FirebaseEx.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\\\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000f*\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/event/common/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "", "trackName", Constants.BIZ, "needTrack", "logTag", "needLog", "Lkotlin/Function1;", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "b", "(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;ZLjava/lang/String;)V", "FlowEventBus_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C12576a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12576a f21602a = new C12576a();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m23701d(C12576a c12576a, String str, String str2, boolean z11, String str3, boolean z12, Function1 function1, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = "firebase-track";
        }
        if ((i11 & 2) != 0) {
            str2 = "NONE";
        }
        if ((i11 & 4) != 0) {
            z11 = c12576a.m23702a();
        }
        if ((i11 & 8) != 0) {
            str3 = "firebase-track";
        }
        if ((i11 & 16) != 0) {
            z12 = c12576a.m23702a();
        }
        c12576a.m23704c(str, str2, z11, str3, z12, function1);
    }

    /* JADX INFO: renamed from: c */
    public final void m23704c(@NotNull String trackName, @NotNull String biz, boolean needTrack, @Nullable String logTag, boolean needLog, @NotNull Function1<? super TechnologyEvent.EventParametersBuilder, Unit> block) throws JSONException {
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(block, "block");
        if (needTrack) {
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            if (biz.length() > 0) {
                eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
            }
            block.invoke(eventParametersBuilderAcquire);
            TechnologyEvent.m42388d(trackName, eventParametersBuilderAcquire);
            f21602a.m23703b(eventParametersBuilderAcquire, needLog, logTag);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m23702a() {
        return C12573b.f21598a.m23696a();
    }

    /* JADX INFO: renamed from: b */
    public final void m23703b(@NotNull TechnologyEvent.EventParametersBuilder eventParametersBuilder, boolean z11, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(eventParametersBuilder, "<this>");
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            Pair<Bundle, Bundle> pairM42390a = eventParametersBuilder.m42390a();
            for (String str2 : pairM42390a.getFirst().keySet()) {
                jSONObject.put(str2, pairM42390a.getFirst().get(str2));
            }
            C44128b.m97259c(str, jSONObject.toString());
        }
    }
}
