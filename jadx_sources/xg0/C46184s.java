package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.json.internal.C41946q0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: renamed from: xg0.s */
/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lxg0/s;", "Lxg0/a;", "Lxg0/f;", "configuration", "Lyg0/a;", "module", "<init>", "(Lxg0/f;Lyg0/a;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46184s extends AbstractC46162a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46184s(@NotNull JsonConfiguration configuration, @NotNull AbstractC46494a module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        m101850h();
    }

    /* JADX INFO: renamed from: h */
    public final void m101850h() {
        if (Intrinsics.areEqual(getSerializersModule(), C46495b.m102577a())) {
            return;
        }
        getSerializersModule().mo92028a(new C41946q0(getConfiguration().getUseArrayPolymorphism(), getConfiguration().getClassDiscriminator()));
    }
}
