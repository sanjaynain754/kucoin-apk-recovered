package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.x */
/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlinx/serialization/json/internal/InternalJsonWriter;", "sb", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/internal/n;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;)Lkotlinx/serialization/json/internal/n;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41959x {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C41939n m92013a(@NotNull InternalJsonWriter sb2, @NotNull AbstractC46162a json) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.getConfiguration().getPrettyPrint() ? new C41957w(sb2, json) : new C41939n(sb2);
    }
}
