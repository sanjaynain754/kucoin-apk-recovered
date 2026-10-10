package p318hp;

import com.kubi.margin.api.entity.MarginBonusConfig;
import com.kubi.utils.extensions.C27025c;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: hp.v0 */
/* JADX INFO: compiled from: MarginWelfareHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/helper/MarginWelfareHelper;", "", "<init>", "()V", "bonus", "Lcom/kubi/margin/api/entity/MarginBonusConfig;", "getBonus", "()Lcom/kubi/margin/api/entity/MarginBonusConfig;", "setBonus", "(Lcom/kubi/margin/api/entity/MarginBonusConfig;)V", "checkBonus", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38279v0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38279v0 f86024a = new C38279v0();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static MarginBonusConfig f86025b;

    /* JADX INFO: renamed from: a */
    public final boolean m86401a(@Nullable MarginBonusConfig marginBonusConfig) {
        if (!C42579a.f94275a.m93347g().c() || marginBonusConfig == null) {
            return false;
        }
        f86025b = marginBonusConfig;
        return C27025c.m66566d(marginBonusConfig.isUnReceive());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final MarginBonusConfig m86402b() {
        return f86025b;
    }
}
