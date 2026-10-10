package p646ty;

import com.kubi.data.BeepHelper;
import com.kubi.lflutter.R$raw;
import com.kubi.utils.DataMapUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ty.a */
/* JADX INFO: compiled from: AppSoundHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/helper/AppSoundHelper;", "", "<init>", "()V", "typeMap", "", "", "Lcom/kubi/sdk/flutter/helper/AppSoundHelper$Sound;", "play", "", "type", "Sound", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45078a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45078a f101478a = new C45078a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, Sound> f101479b;

    /* JADX INFO: renamed from: ty.a$a, reason: from toString */
    /* JADX INFO: compiled from: AppSoundHelper.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/flutter/helper/AppSoundHelper$Sound;", "", "key", "", "raw", "", "<init>", "(Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getRaw", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Sound {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int raw;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sound)) {
                return false;
            }
            Sound sound = (Sound) other;
            return Intrinsics.areEqual(this.key, sound.key) && this.raw == sound.raw;
        }

        public Sound(@NotNull String key, int i11) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.raw = i11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRaw() {
            return this.raw;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + Integer.hashCode(this.raw);
        }

        @NotNull
        public String toString() {
            return "Sound(key=" + this.key + ", raw=" + this.raw + ')';
        }
    }

    static {
        Pair pairM90091to = TuplesKt.m90091to("loginSuccess", new Sound("beep_login", R$raw.login));
        int i11 = R$raw.asset_in;
        Pair pairM90091to2 = TuplesKt.m90091to("assetIn", new Sound("beep_income", i11));
        Pair pairM90091to3 = TuplesKt.m90091to("beep_income", new Sound("beep_income", i11));
        int i12 = R$raw.transfer;
        Pair pairM90091to4 = TuplesKt.m90091to("assetTransfer", new Sound("beep_transfer", i12));
        Pair pairM90091to5 = TuplesKt.m90091to("beep_transfer", new Sound("beep_transfer", i12));
        int i13 = R$raw.asset_out;
        f101479b = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, TuplesKt.m90091to("assetOut", new Sound("beep_outcome", i13)), TuplesKt.m90091to("beep_outcome", new Sound("beep_outcome", i13)), TuplesKt.m90091to("orderCancel", new Sound("beep_revoke", R$raw.revoke)));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m99684a(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Sound sound = f101479b.get(type);
        if (sound == null || !DataMapUtil.f54245a.m66370a(sound.getKey(), true)) {
            return false;
        }
        BeepHelper.m23642f(sound.getKey(), sound.getRaw());
        return true;
    }
}
