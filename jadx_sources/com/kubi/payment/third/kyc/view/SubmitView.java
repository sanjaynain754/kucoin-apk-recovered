package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.SubmitView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.functions.BiConsumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SubmitView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/SubmitView;", "Lcom/kubi/payment/third/kyc/view/AKycBaseView;", "Lio/reactivex/functions/BiConsumer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "", "setItemView", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "submitAction", "Lkotlin/Function1;", "", "accept", "t1", "t2", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubmitView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitView.kt\ncom/kubi/payment/third/kyc/view/SubmitView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1193#2,2:39\n1267#2,4:41\n2746#2,3:46\n1#3:45\n*S KotlinDebug\n*F\n+ 1 SubmitView.kt\ncom/kubi/payment/third/kyc/view/SubmitView\n*L\n28#1:39,2\n28#1:41,4\n36#1:46,3\n*E\n"})
public final class SubmitView extends AKycBaseView implements BiConsumer<String, String> {

    /* JADX INFO: renamed from: d */
    @Nullable
    public Map<String, String> f40243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        getInflater().inflate(R$layout.botc_view_kyc_submit, this);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m49594f(SubmitView submitView, Function1 function1) {
        Map<String, String> map = submitView.f40243d;
        if (map != null && function1 != null) {
            function1.invoke(map);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // io.reactivex.functions.BiConsumer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void accept(@NotNull String t11, @NotNull String t12) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        View viewFindViewById = findViewById(R$id.btn_submit);
        if (viewFindViewById != null) {
            Map<String, String> map = this.f40243d;
            if (map != null) {
                map.put(t11, t12);
                Collection<String> collectionValues = map.values();
                if (collectionValues != null) {
                    boolean z11 = true;
                    if (!collectionValues.isEmpty()) {
                        Iterator<T> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).length() == 0) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z11);
                } else {
                    boolValueOf = null;
                }
            } else {
                boolValueOf = null;
            }
            viewFindViewById.setEnabled(C27025c.m66566d(boolValueOf));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m49596e(@NotNull List<ThirdKycItem> items, @Nullable final Function1<? super Map<String, String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(items, "items");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(items, 10)), 16));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            Pair pairM90091to = TuplesKt.m90091to(C27041f.m66668h(((ThirdKycItem) it.next()).getFieldName()), "");
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        this.f40243d = MapsKt.toMutableMap(linkedHashMap);
        View viewFindViewById = findViewById(R$id.btn_submit);
        if (viewFindViewById != null) {
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: lu.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubmitView.m49594f(this.f93823b, function1);
                }
            }, 1, null);
        }
    }
}
