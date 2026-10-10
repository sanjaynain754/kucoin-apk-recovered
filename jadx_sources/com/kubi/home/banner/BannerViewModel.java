package com.kubi.home.banner;

import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37754f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/banner/BannerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "jump", "", ViewProps.POSITION, "", "title", "", "url", "onExposure", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BannerViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f25528V = new Companion(null);

    /* JADX INFO: compiled from: BannerViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/banner/BannerViewModel$Companion;", "", "<init>", "()V", "BLOCK_ID", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28990b(int i11, @Nullable String str, @Nullable String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", str);
        int i12 = i11 + 1;
        jSONObject.put("sortPosition", String.valueOf(i12));
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        jSONObject.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "leftBanner", "1", jSONObject);
        if (TextUtils.isEmpty(str2)) {
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "leftBanner", String.valueOf(i12)), null, null, 55, null);
        } else {
            Router.f46192a.m56184f(C27041f.m66668h(str2)).m4038a("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "leftBanner", String.valueOf(i12))).m4048k();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m28991d(int i11, @Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", str);
        jSONObject.put("sortPosition", String.valueOf(i11 + 1));
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        jSONObject.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(HomeCardViewHolderProxy.PAGE_ID, "leftBanner", "1", jSONObject);
    }
}
