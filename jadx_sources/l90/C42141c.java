package l90;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l90.c */
/* JADX INFO: compiled from: GlBindable.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Ll90/b;", "Lkotlin/Function0;", "", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ll90/b;Lkotlin/jvm/functions/Function0;)V", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42141c {
    /* JADX INFO: renamed from: a */
    public static final void m92480a(@NotNull InterfaceC42140b interfaceC42140b, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(interfaceC42140b, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        interfaceC42140b.bind();
        block.invoke();
        interfaceC42140b.unbind();
    }
}
