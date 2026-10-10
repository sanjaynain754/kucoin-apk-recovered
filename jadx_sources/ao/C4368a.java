package ao;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.lite.tab.bean.TabConfig;
import fo.C37575a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: ao.a */
/* JADX INFO: compiled from: LiteTabIconUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/lite/tab/LiteTabIconUtil;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "updateIconState", "", "imageView", "Landroid/widget/ImageView;", "config", "Lcom/kubi/lite/tab/bean/TabConfig;", "isSelected", "", "tabCount", "", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4368a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f3763a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f3764b;

    /* JADX INFO: renamed from: a */
    public final void m3894a(@Nullable ImageView imageView, @Nullable TabConfig tabConfig, boolean z11, int i11) {
        try {
            String str = this.f3764b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateIconState start: tabId=");
            sb2.append(tabConfig != null ? tabConfig.getTabId() : null);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", tabCount=");
            sb2.append(i11);
            C44128b.m97266j(str, sb2.toString());
            if (imageView != null && tabConfig != null) {
                C37575a c37575a = C37575a.f83537a;
                String strM84702b = c37575a.m84702b(tabConfig, z11, i11);
                C44128b.m97266j(this.f3764b, "updateIconState: resolving URL path result='" + strM84702b + '\'');
                if (strM84702b.length() <= 0) {
                    int iM84703c = c37575a.m84703c(tabConfig, z11, i11);
                    C44128b.m97266j(this.f3764b, "updateIconState: loading via Local Res, resId=" + iM84703c);
                    if (iM84703c != 0) {
                        imageView.setImageResource(iM84703c);
                        return;
                    }
                    return;
                }
                int iM84701a = c37575a.m84701a(z11);
                imageView.setImageResource(iM84701a);
                C44128b.m97266j(this.f3764b, "updateIconState: loading via Glide, url=" + strM84702b + ", fallbackId=" + iM84701a);
                Intrinsics.checkNotNull(ComponentCallbacks2C5309c.m6556t(this.f3763a).mo6634v(strM84702b).mo92189c().mo92188b0(iM84701a).mo92208m(iM84701a).m6594E0(imageView));
                return;
            }
            C44128b.m97266j(this.f3764b, "updateIconState: imageView or config is null, returning");
        } catch (Exception e11) {
            C44128b.m97261e(this.f3764b, "updateIconState: " + e11);
        }
    }

    public C4368a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3763a = context;
        this.f3764b = "LiteV2-LiteTabIconUtil";
    }
}
