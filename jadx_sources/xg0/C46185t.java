package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xg0.t */
/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lxg0/a;", "from", "Lkotlin/Function1;", "Lxg0/d;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lxg0/a;Lkotlin/jvm/functions/Function1;)Lxg0/a;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46185t {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC46162a m101851a(@NotNull AbstractC46162a from, @NotNull Function1<? super C46168d, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C46168d c46168d = new C46168d(from);
        builderAction.invoke(c46168d);
        return new C46184s(c46168d.m101778a(), c46168d.getSerializersModule());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC46162a m101852b(AbstractC46162a abstractC46162a, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC46162a = AbstractC46162a.INSTANCE;
        }
        return m101851a(abstractC46162a, function1);
    }
}
