package com.kubi.unify.record;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.unify.record.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecordsHelper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJJ\u0010\u000e\u001a\u00020\b2:\u0010\u000f\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00110\u0010j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0011`\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/unify/record/RecordsHelper;", "", "<init>", "()V", "UNIFY_RECORD_TYPE_INTEREST", "", "UNIFY_RECORD_TYPE_CONVERT", "bindCoinInfo", "", FirebaseAnalytics.Param.CURRENCY, "iconAvatar", "Lcom/kubi/resources/widget/CoinAvatarView;", "currencyLabel", "Landroid/widget/TextView;", "bindContentListView", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/Triple;", "", "Lkotlin/collections/ArrayList;", "content", "Landroid/widget/LinearLayout;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordsHelper.kt\ncom/kubi/unify/record/RecordsHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1869#2,2:54\n*S KotlinDebug\n*F\n+ 1 RecordsHelper.kt\ncom/kubi/unify/record/RecordsHelper\n*L\n41#1:54,2\n*E\n"})
public final class RecordsHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RecordsHelper f53332a = new RecordsHelper();

    /* JADX INFO: renamed from: a */
    public final void m65318a(@NotNull String currency, @NotNull CoinAvatarView iconAvatar, @NotNull TextView currencyLabel) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iconAvatar, "iconAvatar");
        Intrinsics.checkNotNullParameter(currencyLabel, "currencyLabel");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(currency);
        C24277v.m58542g(iconAvatar, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        currencyLabel.setText(C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, currency));
    }

    /* JADX INFO: renamed from: b */
    public final void m65319b(@NotNull ArrayList<Triple<Integer, String, Integer>> arrayListOf, @NotNull LinearLayout content) {
        Intrinsics.checkNotNullParameter(arrayListOf, "arrayListOf");
        Intrinsics.checkNotNullParameter(content, "content");
        content.removeAllViews();
        Iterator<T> it = arrayListOf.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            View viewInflate = LayoutInflater.from(content.getContext()).inflate(R$layout.unify_item_reords_content, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R$id.titleLabel)).setText(C27017c.f54310a.m66516f(((Number) triple.getFirst()).intValue(), new Object[0]));
            TextView textView = (TextView) viewInflate.findViewById(R$id.contentLabel);
            textView.setText((CharSequence) triple.getSecond());
            textView.setTextColor(((Number) triple.getThird()).intValue());
            content.addView(viewInflate);
        }
    }
}
