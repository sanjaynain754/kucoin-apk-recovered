package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.view.WindowMetrics;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.PredicateAdapter;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.core.util.function.Predicate;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EmbeddingAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u000389:B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eJ\u0015\u0010\r\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0010\u0010\r\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\r\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001eJ\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%H\u0002J\u000e\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140-J$\u0010.\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u0002002\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%H\u0002J$\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u0002032\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006;"}, m90084d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "predicateAdapter", "Landroidx/window/core/PredicateAdapter;", "(Landroidx/window/core/PredicateAdapter;)V", "api1Impl", "Landroidx/window/embedding/EmbeddingAdapter$VendorApiLevel1Impl;", "api2Impl", "Landroidx/window/embedding/EmbeddingAdapter$VendorApiLevel2Impl;", "vendorApiLevel", "", "getVendorApiLevel", "()I", "translate", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "context", "Landroid/content/Context;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "Landroidx/window/embedding/SplitAttributes;", "splitAttributes", "Landroidx/window/extensions/embedding/SplitAttributes;", "translate$window_release", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", ReportDataTable.COLUMN_PARAMS, "Landroidx/window/extensions/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "translateActivityRule", "Landroidx/window/extensions/embedding/ActivityRule;", "rule", "Landroidx/window/embedding/ActivityRule;", "predicateClass", "Ljava/lang/Class;", "translateFinishBehavior", "behavior", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "translateSplitAttributes", "translateSplitAttributesCalculator", "Landroidx/window/extensions/core/util/function/Function;", "calculator", "Lkotlin/Function1;", "translateSplitPairRule", "Landroidx/window/extensions/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitPairRule;", "translateSplitPlaceholderRule", "Landroidx/window/extensions/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitPlaceholderRule;", "translateSplitType", "Landroidx/window/extensions/embedding/SplitAttributes$SplitType;", "splitType", "Landroidx/window/embedding/SplitAttributes$SplitType;", "Companion", "VendorApiLevel1Impl", "VendorApiLevel2Impl", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmbeddingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddingAdapter.kt\nandroidx/window/embedding/EmbeddingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n1549#2:525\n1620#2,3:526\n1549#2:529\n1620#2,3:530\n1747#2,3:533\n1747#2,3:536\n1747#2,3:539\n1747#2,3:542\n1747#2,3:545\n1747#2,3:548\n*S KotlinDebug\n*F\n+ 1 EmbeddingAdapter.kt\nandroidx/window/embedding/EmbeddingAdapter\n*L\n71#1:525\n71#1:526,3\n307#1:529\n307#1:530,3\n158#1:533,3\n164#1:536,3\n247#1:539,3\n250#1:542,3\n290#1:545,3\n293#1:548,3\n*E\n"})
public final class EmbeddingAdapter {

    @NotNull
    private final VendorApiLevel1Impl api1Impl;

    @NotNull
    private final VendorApiLevel2Impl api2Impl;

    @NotNull
    private final PredicateAdapter predicateAdapter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Binder INVALID_SPLIT_INFO_TOKEN = new Binder();

    @NotNull
    private static final Binder INVALID_ACTIVITY_STACK_TOKEN = new Binder();

    /* JADX INFO: compiled from: EmbeddingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m90084d2 = {"Landroidx/window/embedding/EmbeddingAdapter$Companion;", "", "()V", "INVALID_ACTIVITY_STACK_TOKEN", "Landroid/os/Binder;", "getINVALID_ACTIVITY_STACK_TOKEN", "()Landroid/os/Binder;", "INVALID_SPLIT_INFO_TOKEN", "getINVALID_SPLIT_INFO_TOKEN", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Binder getINVALID_ACTIVITY_STACK_TOKEN() {
            return EmbeddingAdapter.INVALID_ACTIVITY_STACK_TOKEN;
        }

        @NotNull
        public final Binder getINVALID_SPLIT_INFO_TOKEN() {
            return EmbeddingAdapter.INVALID_SPLIT_INFO_TOKEN;
        }
    }

    /* JADX INFO: compiled from: EmbeddingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003J\u0016\u0010\u0012\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003J\u0016\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001e\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0003J\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0003J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\r\u001a\u00020\bH\u0002J\"\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020*2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bJ\"\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020-2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bJ\u0014\u0010.\u001a\u00020/*\u00020/2\u0006\u00100\u001a\u00020\bH\u0002J\u0014\u0010.\u001a\u000201*\u0002012\u0006\u00100\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u00062"}, m90084d2 = {"Landroidx/window/embedding/EmbeddingAdapter$VendorApiLevel1Impl;", "", "predicateAdapter", "Landroidx/window/core/PredicateAdapter;", "(Landroidx/window/embedding/EmbeddingAdapter;Landroidx/window/core/PredicateAdapter;)V", "getPredicateAdapter", "()Landroidx/window/core/PredicateAdapter;", "getSplitAttributesCompat", "Landroidx/window/embedding/SplitAttributes;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "isSplitAttributesSupported", "", "attrs", "translateActivityIntentPredicates", "splitPairFilters", "", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateActivityRuleCompat", "Landroidx/window/extensions/embedding/ActivityRule;", "rule", "Landroidx/window/embedding/ActivityRule;", "predicateClass", "Ljava/lang/Class;", "translateCompat", "Landroidx/window/embedding/SplitInfo;", "translateIntentPredicates", "translateParentMetricsPredicate", "context", "Landroid/content/Context;", "splitRule", "Landroidx/window/embedding/SplitRule;", "translateSplitAttributesCompatInternal", "Lkotlin/Pair;", "", "", "translateSplitPairRuleCompat", "Landroidx/window/extensions/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitPairRule;", "translateSplitPlaceholderRuleCompat", "Landroidx/window/extensions/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitPlaceholderRule;", "setDefaultSplitAttributesCompat", "Landroidx/window/extensions/embedding/SplitPairRule$Builder;", "defaultAttrs", "Landroidx/window/extensions/embedding/SplitPlaceholderRule$Builder;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class VendorApiLevel1Impl {

        @NotNull
        private final PredicateAdapter predicateAdapter;
        final /* synthetic */ EmbeddingAdapter this$0;

        private final androidx.window.extensions.embedding.SplitPlaceholderRule.Builder setDefaultSplitAttributesCompat(androidx.window.extensions.embedding.SplitPlaceholderRule.Builder builder, SplitAttributes splitAttributes) {
            Pair<Float, Integer> pairTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = pairTranslateSplitAttributesCompatInternal.component1().floatValue();
            int iIntValue = pairTranslateSplitAttributesCompatInternal.component2().intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityIntentPredicates(final Set<SplitPairFilter> splitPairFilters) {
            return this.predicateAdapter.buildPairPredicate(Reflection.getOrCreateKotlinClass(Activity.class), Reflection.getOrCreateKotlinClass(Intent.class), new Function2<Activity, Intent, Boolean>() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateActivityIntentPredicates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p852kotlin.jvm.functions.Function2
                @NotNull
                public final Boolean invoke(@NotNull Activity first, @NotNull Intent second) {
                    Intrinsics.checkNotNullParameter(first, "first");
                    Intrinsics.checkNotNullParameter(second, "second");
                    Set<SplitPairFilter> set = splitPairFilters;
                    boolean z11 = false;
                    if (set == null || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (((SplitPairFilter) it.next()).matchesActivityIntentPair(first, second)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
            });
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityPairPredicates(final Set<SplitPairFilter> splitPairFilters) {
            return this.predicateAdapter.buildPairPredicate(Reflection.getOrCreateKotlinClass(Activity.class), Reflection.getOrCreateKotlinClass(Activity.class), new Function2<Activity, Activity, Boolean>() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPairPredicates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p852kotlin.jvm.functions.Function2
                @NotNull
                public final Boolean invoke(@NotNull Activity first, @NotNull Activity second) {
                    Intrinsics.checkNotNullParameter(first, "first");
                    Intrinsics.checkNotNullParameter(second, "second");
                    Set<SplitPairFilter> set = splitPairFilters;
                    boolean z11 = false;
                    if (set == null || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (((SplitPairFilter) it.next()).matchesActivityPair(first, second)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
            });
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityPredicates(final Set<ActivityFilter> activityFilters) {
            return this.predicateAdapter.buildPredicate(Reflection.getOrCreateKotlinClass(Activity.class), new Function1<Activity, Boolean>() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPredicates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Set<ActivityFilter> set = activityFilters;
                    boolean z11 = false;
                    if (set == null || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
            });
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateIntentPredicates(final Set<ActivityFilter> activityFilters) {
            return this.predicateAdapter.buildPredicate(Reflection.getOrCreateKotlinClass(Intent.class), new Function1<Intent, Boolean>() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateIntentPredicates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Intent intent) {
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    Set<ActivityFilter> set = activityFilters;
                    boolean z11 = false;
                    if (set == null || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
            });
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateParentMetricsPredicate(final Context context, final SplitRule splitRule) {
            return this.predicateAdapter.buildPredicate(Reflection.getOrCreateKotlinClass(C4252j.m3859a()), new Function1<WindowMetrics, Boolean>() { // from class: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateParentMetricsPredicate$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(WindowMetrics windowMetrics) {
                    return invoke2(C4253k.m3860a(windowMetrics));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(@NotNull WindowMetrics windowMetrics) {
                    Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
                    return Boolean.valueOf(splitRule.checkParentMetrics$window_release(context, windowMetrics));
                }
            });
        }

        @NotNull
        public final PredicateAdapter getPredicateAdapter() {
            return this.predicateAdapter;
        }

        @NotNull
        public final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRuleCompat(@NotNull Context context, @NotNull SplitPairRule rule, @NotNull Class<?> predicateClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rule, "rule");
            Intrinsics.checkNotNullParameter(predicateClass, "predicateClass");
            Object objNewInstance = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getConstructor(predicateClass, predicateClass, predicateClass).newInstance(translateActivityPairPredicates(rule.getFilters()), translateActivityIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule));
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "SplitPairRuleBuilder::cl…text, rule)\n            )");
            androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = setDefaultSplitAttributesCompat((androidx.window.extensions.embedding.SplitPairRule.Builder) objNewInstance, rule.getDefaultSplitAttributes()).setShouldClearTop(rule.getClearTop()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(this.this$0.translateFinishBehavior(rule.getFinishSecondaryWithPrimary())).build();
            Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPairRuleBuilder::cl…                ).build()");
            return splitPairRuleBuild;
        }

        @NotNull
        public final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRuleCompat(@NotNull Context context, @NotNull SplitPlaceholderRule rule, @NotNull Class<?> predicateClass) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rule, "rule");
            Intrinsics.checkNotNullParameter(predicateClass, "predicateClass");
            androidx.window.extensions.embedding.SplitPlaceholderRule.Builder finishPrimaryWithSecondary = ((androidx.window.extensions.embedding.SplitPlaceholderRule.Builder) androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getConstructor(Intent.class, predicateClass, predicateClass, predicateClass).newInstance(rule.getPlaceholderIntent(), translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule))).setSticky(rule.getIsSticky()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithPlaceholder()));
            Intrinsics.checkNotNullExpressionValue(finishPrimaryWithSecondary, "SplitPlaceholderRuleBuil…holder)\n                )");
            androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = setDefaultSplitAttributesCompat(finishPrimaryWithSecondary, rule.getDefaultSplitAttributes()).build();
            Intrinsics.checkNotNullExpressionValue(splitPlaceholderRuleBuild, "SplitPlaceholderRuleBuil…\n                .build()");
            return splitPlaceholderRuleBuild;
        }

        public VendorApiLevel1Impl(@NotNull EmbeddingAdapter embeddingAdapter, PredicateAdapter predicateAdapter) {
            Intrinsics.checkNotNullParameter(predicateAdapter, "predicateAdapter");
            this.this$0 = embeddingAdapter;
            this.predicateAdapter = predicateAdapter;
        }

        private final boolean isSplitAttributesSupported(SplitAttributes attrs) {
            double value = attrs.getSplitType().getValue();
            if (0.0d <= value && value <= 1.0d && attrs.getSplitType().getValue() != 1.0f && ArraysKt.contains(new SplitAttributes.LayoutDirection[]{SplitAttributes.LayoutDirection.LEFT_TO_RIGHT, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT, SplitAttributes.LayoutDirection.LOCALE}, attrs.getLayoutDir())) {
                return true;
            }
            return false;
        }

        private final Pair<Float, Integer> translateSplitAttributesCompatInternal(SplitAttributes attrs) {
            int i11 = 3;
            if (!isSplitAttributesSupported(attrs)) {
                return new Pair<>(Float.valueOf(0.0f), 3);
            }
            Float fValueOf = Float.valueOf(attrs.getSplitType().getValue());
            SplitAttributes.LayoutDirection layoutDir = attrs.getLayoutDir();
            if (!Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.LOCALE)) {
                if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
                    i11 = 0;
                } else if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
                    i11 = 1;
                } else {
                    throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                }
            }
            return new Pair<>(fValueOf, Integer.valueOf(i11));
        }

        @NotNull
        public final SplitAttributes getSplitAttributesCompat(@NotNull androidx.window.extensions.embedding.SplitInfo splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            return new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.INSTANCE.buildSplitTypeFromValue$window_release(splitInfo.getSplitRatio())).setLayoutDirection(SplitAttributes.LayoutDirection.LOCALE).build();
        }

        @NotNull
        public final androidx.window.extensions.embedding.ActivityRule translateActivityRuleCompat(@NotNull ActivityRule rule, @NotNull Class<?> predicateClass) {
            Intrinsics.checkNotNullParameter(rule, "rule");
            Intrinsics.checkNotNullParameter(predicateClass, "predicateClass");
            androidx.window.extensions.embedding.ActivityRule activityRuleBuild = ((androidx.window.extensions.embedding.ActivityRule.Builder) androidx.window.extensions.embedding.ActivityRule.Builder.class.getConstructor(predicateClass, predicateClass).newInstance(translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()))).setShouldAlwaysExpand(rule.getAlwaysExpand()).build();
            Intrinsics.checkNotNullExpressionValue(activityRuleBuild, "ActivityRuleBuilder::cla…\n                .build()");
            return activityRuleBuild;
        }

        @NotNull
        public final SplitInfo translateCompat(@NotNull androidx.window.extensions.embedding.SplitInfo splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            List activities = splitInfo.getPrimaryActivityStack().getActivities();
            Intrinsics.checkNotNullExpressionValue(activities, "splitInfo.primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, splitInfo.getPrimaryActivityStack().isEmpty());
            List activities2 = splitInfo.getSecondaryActivityStack().getActivities();
            Intrinsics.checkNotNullExpressionValue(activities2, "splitInfo.secondaryActivityStack.activities");
            return new SplitInfo(activityStack, new ActivityStack(activities2, splitInfo.getSecondaryActivityStack().isEmpty()), getSplitAttributesCompat(splitInfo), EmbeddingAdapter.INSTANCE.getINVALID_SPLIT_INFO_TOKEN());
        }

        private final androidx.window.extensions.embedding.SplitPairRule.Builder setDefaultSplitAttributesCompat(androidx.window.extensions.embedding.SplitPairRule.Builder builder, SplitAttributes splitAttributes) {
            Pair<Float, Integer> pairTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = pairTranslateSplitAttributesCompatInternal.component1().floatValue();
            int iIntValue = pairTranslateSplitAttributesCompatInternal.component2().intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }
    }

    /* JADX INFO: compiled from: EmbeddingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Landroidx/window/embedding/EmbeddingAdapter$VendorApiLevel2Impl;", "", "(Landroidx/window/embedding/EmbeddingAdapter;)V", "translateCompat", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class VendorApiLevel2Impl {
        public VendorApiLevel2Impl() {
        }

        @NotNull
        public final SplitInfo translateCompat(@NotNull androidx.window.extensions.embedding.SplitInfo splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
            List activities = primaryActivityStack.getActivities();
            Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
            List activities2 = secondaryActivityStack.getActivities();
            Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
            ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
            EmbeddingAdapter embeddingAdapter = EmbeddingAdapter.this;
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            Intrinsics.checkNotNullExpressionValue(splitAttributes, "splitInfo.splitAttributes");
            return new SplitInfo(activityStack, activityStack2, embeddingAdapter.translate$window_release(splitAttributes), EmbeddingAdapter.INSTANCE.getINVALID_SPLIT_INFO_TOKEN());
        }
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        int vendorApiLevel = getVendorApiLevel();
        if (vendorApiLevel == 1) {
            return this.api1Impl.translateCompat(splitInfo);
        }
        if (vendorApiLevel == 2) {
            return this.api2Impl.translateCompat(splitInfo);
        }
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
        androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
        Intrinsics.checkNotNullExpressionValue(splitAttributes, "splitInfo.splitAttributes");
        SplitAttributes splitAttributesTranslate$window_release = translate$window_release(splitAttributes);
        IBinder token = splitInfo.getToken();
        Intrinsics.checkNotNullExpressionValue(token, "splitInfo.token");
        return new SplitInfo(activityStack, activityStack2, splitAttributesTranslate$window_release, token);
    }

    private final int getVendorApiLevel() {
        return WindowSdkExtensions.INSTANCE.getInstance().getExtensionVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateActivityRule$lambda$13(ActivityRule rule, Activity activity) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateActivityRule$lambda$15(ActivityRule rule, Intent intent) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$3(SplitPairRule rule, android.util.Pair pair) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "activitiesPair.first");
            Object obj2 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "activitiesPair.second");
            if (splitPairFilter.matchesActivityPair((Activity) obj, (Activity) obj2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$5(SplitPairRule rule, android.util.Pair pair) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "activityIntentPair.first");
            Object obj2 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "activityIntentPair.second");
            if (splitPairFilter.matchesActivityIntentPair((Activity) obj, (Intent) obj2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$6(SplitPairRule rule, Context context, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$10(SplitPlaceholderRule rule, Intent intent) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$11(SplitPlaceholderRule rule, Context context, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$8(SplitPlaceholderRule rule, Activity activity) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    public final int translateFinishBehavior(@NotNull SplitRule.FinishBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (Intrinsics.areEqual(behavior, SplitRule.FinishBehavior.NEVER)) {
            return 0;
        }
        if (Intrinsics.areEqual(behavior, SplitRule.FinishBehavior.ALWAYS)) {
            return 1;
        }
        if (Intrinsics.areEqual(behavior, SplitRule.FinishBehavior.ADJACENT)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown finish behavior:" + behavior);
    }

    @NotNull
    public final Function<androidx.window.extensions.embedding.SplitAttributesCalculatorParams, androidx.window.extensions.embedding.SplitAttributes> translateSplitAttributesCalculator(@NotNull final Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        return new Function() { // from class: androidx.window.embedding.d
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return EmbeddingAdapter.translateSplitAttributesCalculator$lambda$0(this.f3701a, calculator, (androidx.window.extensions.embedding.SplitAttributesCalculatorParams) obj);
            }
        };
    }

    public EmbeddingAdapter(@NotNull PredicateAdapter predicateAdapter) {
        Intrinsics.checkNotNullParameter(predicateAdapter, "predicateAdapter");
        this.predicateAdapter = predicateAdapter;
        this.api1Impl = new VendorApiLevel1Impl(this, predicateAdapter);
        this.api2Impl = new VendorApiLevel2Impl();
    }

    private final androidx.window.extensions.embedding.ActivityRule translateActivityRule(final ActivityRule rule, Class<?> predicateClass) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateActivityRuleCompat(rule, predicateClass);
        }
        androidx.window.extensions.embedding.ActivityRule.Builder shouldAlwaysExpand = new androidx.window.extensions.embedding.ActivityRule.Builder(new Predicate() { // from class: androidx.window.embedding.h
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateActivityRule$lambda$13(rule, (Activity) obj);
            }
        }, new Predicate() { // from class: androidx.window.embedding.i
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateActivityRule$lambda$15(rule, (Intent) obj);
            }
        }).setShouldAlwaysExpand(rule.getAlwaysExpand());
        Intrinsics.checkNotNullExpressionValue(shouldAlwaysExpand, "ActivityRuleBuilder(acti…Expand(rule.alwaysExpand)");
        String tag = rule.getTag();
        if (tag != null) {
            shouldAlwaysExpand.setTag(tag);
        }
        androidx.window.extensions.embedding.ActivityRule activityRuleBuild = shouldAlwaysExpand.build();
        Intrinsics.checkNotNullExpressionValue(activityRuleBuild, "builder.build()");
        return activityRuleBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributesCalculator$lambda$0(EmbeddingAdapter this$0, Function1 calculator, androidx.window.extensions.embedding.SplitAttributesCalculatorParams oemParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(calculator, "$calculator");
        Intrinsics.checkNotNullExpressionValue(oemParams, "oemParams");
        return this$0.translateSplitAttributes((SplitAttributes) calculator.invoke(this$0.translate(oemParams)));
    }

    private final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRule(final Context context, final SplitPairRule rule, Class<?> predicateClass) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPairRuleCompat(context, rule, predicateClass);
        }
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.e
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$3(rule, (android.util.Pair) obj);
            }
        };
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.f
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$5(rule, (android.util.Pair) obj);
            }
        };
        Predicate predicate3 = new Predicate() { // from class: androidx.window.embedding.g
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPairRule$lambda$6(rule, context, (WindowMetrics) obj);
            }
        };
        String tag = rule.getTag();
        androidx.window.extensions.embedding.SplitPairRule.Builder shouldClearTop = new androidx.window.extensions.embedding.SplitPairRule.Builder(predicate, predicate2, predicate3).setDefaultSplitAttributes(translateSplitAttributes(rule.getDefaultSplitAttributes())).setFinishPrimaryWithSecondary(translateFinishBehavior(rule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(translateFinishBehavior(rule.getFinishSecondaryWithPrimary())).setShouldClearTop(rule.getClearTop());
        Intrinsics.checkNotNullExpressionValue(shouldClearTop, "SplitPairRuleBuilder(\n  …ldClearTop(rule.clearTop)");
        if (tag != null) {
            shouldClearTop.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = shouldClearTop.build();
        Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "builder.build()");
        return splitPairRuleBuild;
    }

    private final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRule(final Context context, final SplitPlaceholderRule rule, Class<?> predicateClass) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPlaceholderRuleCompat(context, rule, predicateClass);
        }
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.a
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8(rule, (Activity) obj);
            }
        };
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.b
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10(rule, (Intent) obj);
            }
        };
        Predicate predicate3 = new Predicate() { // from class: androidx.window.embedding.c
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$11(rule, context, (WindowMetrics) obj);
            }
        };
        String tag = rule.getTag();
        androidx.window.extensions.embedding.SplitPlaceholderRule.Builder finishPrimaryWithPlaceholder = new androidx.window.extensions.embedding.SplitPlaceholderRule.Builder(rule.getPlaceholderIntent(), predicate, predicate2, predicate3).setSticky(rule.getIsSticky()).setDefaultSplitAttributes(translateSplitAttributes(rule.getDefaultSplitAttributes())).setFinishPrimaryWithPlaceholder(translateFinishBehavior(rule.getFinishPrimaryWithPlaceholder()));
        Intrinsics.checkNotNullExpressionValue(finishPrimaryWithPlaceholder, "SplitPlaceholderRuleBuil…holder)\n                )");
        if (tag != null) {
            finishPrimaryWithPlaceholder.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = finishPrimaryWithPlaceholder.build();
        Intrinsics.checkNotNullExpressionValue(splitPlaceholderRuleBuild, "builder.build()");
        return splitPlaceholderRuleBuild;
    }

    private final androidx.window.extensions.embedding.SplitAttributes.SplitType translateSplitType(SplitAttributes.SplitType splitType) {
        if (getVendorApiLevel() >= 2) {
            if (Intrinsics.areEqual(splitType, SplitAttributes.SplitType.SPLIT_TYPE_HINGE)) {
                return new androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType(translateSplitType(SplitAttributes.SplitType.SPLIT_TYPE_EQUAL));
            }
            if (Intrinsics.areEqual(splitType, SplitAttributes.SplitType.SPLIT_TYPE_EXPAND)) {
                return new androidx.window.extensions.embedding.SplitAttributes.SplitType.ExpandContainersSplitType();
            }
            float value = splitType.getValue();
            double d11 = value;
            if (d11 > 0.0d && d11 < 1.0d) {
                return new androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType(value);
            }
            throw new IllegalArgumentException("Unsupported SplitType: " + splitType + " with value: " + splitType.getValue());
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @NotNull
    public final SplitAttributes translate$window_release(@NotNull androidx.window.extensions.embedding.SplitAttributes splitAttributes) {
        SplitAttributes.SplitType splitTypeRatio;
        SplitAttributes.LayoutDirection layoutDirection;
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        SplitAttributes.Builder builder = new SplitAttributes.Builder();
        androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType splitType = splitAttributes.getSplitType();
        Intrinsics.checkNotNullExpressionValue(splitType, "splitAttributes.splitType");
        if (splitType instanceof androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_HINGE;
        } else if (splitType instanceof androidx.window.extensions.embedding.SplitAttributes.SplitType.ExpandContainersSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_EXPAND;
        } else if (splitType instanceof androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.INSTANCE.ratio(splitType.getRatio());
        } else {
            throw new IllegalArgumentException("Unknown split type: " + splitType);
        }
        SplitAttributes.Builder splitType2 = builder.setSplitType(splitTypeRatio);
        int layoutDirection2 = splitAttributes.getLayoutDirection();
        if (layoutDirection2 != 0) {
            if (layoutDirection2 != 1) {
                if (layoutDirection2 != 3) {
                    if (layoutDirection2 != 4) {
                        if (layoutDirection2 == 5) {
                            layoutDirection = SplitAttributes.LayoutDirection.BOTTOM_TO_TOP;
                        } else {
                            throw new IllegalArgumentException("Unknown layout direction: " + layoutDirection2);
                        }
                    } else {
                        layoutDirection = SplitAttributes.LayoutDirection.TOP_TO_BOTTOM;
                    }
                } else {
                    layoutDirection = SplitAttributes.LayoutDirection.LOCALE;
                }
            } else {
                layoutDirection = SplitAttributes.LayoutDirection.RIGHT_TO_LEFT;
            }
        } else {
            layoutDirection = SplitAttributes.LayoutDirection.LEFT_TO_RIGHT;
        }
        return splitType2.setLayoutDirection(layoutDirection).build();
    }

    @NotNull
    public final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributes(@NotNull SplitAttributes splitAttributes) {
        int i11;
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        if (getVendorApiLevel() >= 2) {
            androidx.window.extensions.embedding.SplitAttributes.Builder splitType = new androidx.window.extensions.embedding.SplitAttributes.Builder().setSplitType(translateSplitType(splitAttributes.getSplitType()));
            SplitAttributes.LayoutDirection layoutDir = splitAttributes.getLayoutDir();
            if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.LOCALE)) {
                i11 = 3;
            } else if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
                i11 = 0;
            } else if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
                i11 = 1;
            } else if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.TOP_TO_BOTTOM)) {
                i11 = 4;
            } else if (Intrinsics.areEqual(layoutDir, SplitAttributes.LayoutDirection.BOTTOM_TO_TOP)) {
                i11 = 5;
            } else {
                throw new IllegalArgumentException("Unsupported layoutDirection:" + splitAttributes + ".layoutDirection");
            }
            androidx.window.extensions.embedding.SplitAttributes splitAttributesBuild = splitType.setLayoutDirection(i11).build();
            Intrinsics.checkNotNullExpressionValue(splitAttributesBuild, "Builder()\n            .s…   )\n            .build()");
            return splitAttributesBuild;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public final SplitAttributesCalculatorParams translate(@NotNull androidx.window.extensions.embedding.SplitAttributesCalculatorParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        WindowMetrics parentWindowMetrics = params.getParentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(parentWindowMetrics, "params.parentWindowMetrics");
        Configuration parentConfiguration = params.getParentConfiguration();
        Intrinsics.checkNotNullExpressionValue(parentConfiguration, "params.parentConfiguration");
        WindowLayoutInfo parentWindowLayoutInfo = params.getParentWindowLayoutInfo();
        Intrinsics.checkNotNullExpressionValue(parentWindowLayoutInfo, "params.parentWindowLayoutInfo");
        androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = params.getDefaultSplitAttributes();
        Intrinsics.checkNotNullExpressionValue(defaultSplitAttributes, "params.defaultSplitAttributes");
        boolean zAreDefaultConstraintsSatisfied = params.areDefaultConstraintsSatisfied();
        String splitRuleTag = params.getSplitRuleTag();
        androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window_release = WindowMetricsCalculator.INSTANCE.translateWindowMetrics$window_release(parentWindowMetrics);
        return new SplitAttributesCalculatorParams(windowMetricsTranslateWindowMetrics$window_release, parentConfiguration, ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(windowMetricsTranslateWindowMetrics$window_release, parentWindowLayoutInfo), translate$window_release(defaultSplitAttributes), zAreDefaultConstraintsSatisfied, splitRuleTag);
    }

    @NotNull
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull Context context, @NotNull Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleTranslateActivityRule;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Class<?> clsPredicateClassOrNull$window_release = this.predicateAdapter.predicateClassOrNull$window_release();
        if (clsPredicateClassOrNull$window_release == null) {
            return SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rules, 10));
        for (EmbeddingRule embeddingRule : rules) {
            if (embeddingRule instanceof SplitPairRule) {
                splitPairRuleTranslateActivityRule = translateSplitPairRule(context, (SplitPairRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                splitPairRuleTranslateActivityRule = translateSplitPlaceholderRule(context, (SplitPlaceholderRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                splitPairRuleTranslateActivityRule = translateActivityRule((ActivityRule) embeddingRule, clsPredicateClassOrNull$window_release);
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) splitPairRuleTranslateActivityRule);
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public final List<SplitInfo> translate(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(splitInfoList, 10));
        Iterator<T> it = splitInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }
}
