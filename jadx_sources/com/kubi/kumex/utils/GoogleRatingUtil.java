package com.kubi.kumex.utils;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ru.C44176b;

/* JADX INFO: renamed from: com.kubi.kumex.utils.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GoogleRatingUtil.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/utils/GoogleRatingUtil;", "", "<init>", "()V", "showGoogleRatingDialog", "", "activity", "Landroidx/fragment/app/FragmentActivity;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isNewYear", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GoogleRatingUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GoogleRatingUtil f30812a = new GoogleRatingUtil();

    /* JADX INFO: renamed from: b */
    public final void m36610b(@Nullable FragmentActivity fragmentActivity, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (fragmentActivity == null || C27039d.m66656p(position.getUnrealisedRoePcnt()).compareTo(new BigDecimal("0.1")) < 0 || m36609a()) {
            return;
        }
        C44176b.f97516a.m97395b(fragmentActivity);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36609a() {
        int i11 = Calendar.getInstance().get(1);
        String str = "contract_google_rating_" + KuMexDepend.f30378a.m35905g().d();
        Persistence persistence = Persistence.f30799a;
        String strM36518d = persistence.m36518d(str, "0");
        persistence.m36521h(str, String.valueOf(i11));
        return !Intrinsics.areEqual(String.valueOf(i11), strM36518d);
    }
}
