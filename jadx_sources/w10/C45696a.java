package w10;

import com.kubi.share.api.entity.PageTextConfigEntity;
import com.kubi.share.api.entity.ShareReferralEntity;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: w10.a */
/* JADX INFO: compiled from: ShareData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"currentShareData", "Lcom/kubi/share/api/entity/ShareReferralEntity;", "getCurrentShareData", "()Lcom/kubi/share/api/entity/ShareReferralEntity;", "setCurrentShareData", "(Lcom/kubi/share/api/entity/ShareReferralEntity;)V", "pageTextConfig", "Lcom/kubi/share/api/entity/PageTextConfigEntity;", "getPageTextConfig", "()Lcom/kubi/share/api/entity/PageTextConfigEntity;", "setPageTextConfig", "(Lcom/kubi/share/api/entity/PageTextConfigEntity;)V", "ShareApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45696a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static ShareReferralEntity f103032a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public static PageTextConfigEntity f103033b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ShareReferralEntity m100871a() {
        return f103032a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final PageTextConfigEntity m100872b() {
        return f103033b;
    }

    /* JADX INFO: renamed from: c */
    public static final void m100873c(@Nullable ShareReferralEntity shareReferralEntity) {
        f103032a = shareReferralEntity;
    }

    /* JADX INFO: renamed from: d */
    public static final void m100874d(@Nullable PageTextConfigEntity pageTextConfigEntity) {
        f103033b = pageTextConfigEntity;
    }
}
