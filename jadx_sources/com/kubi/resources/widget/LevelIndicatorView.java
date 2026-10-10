package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27046k;
import java.util.Iterator;
import java.util.List;
import k00.C40844h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LevelIndicatorView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/LevelIndicatorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", FirebaseAnalytics.Param.LEVEL, "Lcom/kubi/resources/widget/Level;", "binding", "Lcom/kubi/sdk/res/databinding/KucoinRiskLevelIndicatorViewBinding;", "setNeedDash", "", "needDash", "", "setTitle", "text", "", "setLevel", "getLevel", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLevelIndicatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelIndicatorView.kt\ncom/kubi/resources/widget/LevelIndicatorView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1869#2,2:124\n1869#2,2:126\n*S KotlinDebug\n*F\n+ 1 LevelIndicatorView.kt\ncom/kubi/resources/widget/LevelIndicatorView\n*L\n77#1:124,2\n87#1:126,2\n*E\n"})
public final class LevelIndicatorView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public Level f43895b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C40844h f43896c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m54655c(LevelIndicatorView levelIndicatorView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        levelIndicatorView.m54657b(str, z11);
    }

    /* JADX INFO: renamed from: a */
    public final Level m54656a(int i11) {
        if (i11 == 0) {
            return Level.a.f44928a;
        }
        if (i11 == 1) {
            return Level.b.f44930a;
        }
        if (i11 != 2) {
            return i11 != 3 ? Level.a.f44928a : Level.c.f44932a;
        }
        return Level.d.f44934a;
    }

    /* JADX INFO: renamed from: b */
    public final void m54657b(@NotNull String text, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43896c.f90763g.setText(text);
        this.f43896c.f90763g.setNeedDash(z11);
    }

    public final void setLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f43895b = level;
        C40844h c40844h = this.f43896c;
        List listListOf = CollectionsKt.listOf((Object[]) new View[]{c40844h.f90758b, c40844h.f90759c, c40844h.f90760d});
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66699n = C27046k.m66699n(context, Level.a.f44928a.mo55374a());
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setBackgroundColor(iM66699n);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM66699n2 = C27046k.m66699n(context2, level.mo55374a());
        if (Intrinsics.areEqual(level, Level.b.f44930a)) {
            this.f43896c.f90758b.setBackgroundColor(iM66699n2);
            return;
        }
        if (Intrinsics.areEqual(level, Level.d.f44934a)) {
            this.f43896c.f90758b.setBackgroundColor(iM66699n2);
            this.f43896c.f90759c.setBackgroundColor(iM66699n2);
        } else if (!Intrinsics.areEqual(level, Level.c.f44932a)) {
            if (!Intrinsics.areEqual(level, Level.a.f44928a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Iterator it2 = listListOf.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setBackgroundColor(iM66699n2);
            }
        }
    }

    public final void setNeedDash(boolean needDash) {
        this.f43896c.f90763g.setNeedDash(needDash);
    }

    public /* synthetic */ LevelIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43895b = Level.a.f44928a;
        C40844h c40844hM89386c = C40844h.m89386c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c40844hM89386c, "inflate(...)");
        this.f43896c = c40844hM89386c;
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LevelIndicatorView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43895b = m54656a(typedArrayObtainStyledAttributes.getInt(R$styleable.LevelIndicatorView_level, 0));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.LevelIndicatorView_titleText);
        string = string == null ? "" : string;
        int i12 = R$styleable.LevelIndicatorView_android_textColor;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            c40844hM89386c.f90763g.setTextColor(typedArrayObtainStyledAttributes.getColor(i12, ViewCompat.MEASURED_STATE_MASK));
        }
        int i13 = R$styleable.LevelIndicatorView_android_textSize;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            c40844hM89386c.f90763g.setTextSize(0, typedArrayObtainStyledAttributes.getDimension(i13, 14.0f));
        }
        int i14 = R$styleable.LevelIndicatorView_android_tag;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            c40844hM89386c.f90763g.setTag(typedArrayObtainStyledAttributes.getText(i14));
        }
        typedArrayObtainStyledAttributes.recycle();
        m54655c(this, string, false, 2, null);
        setLevel(Level.b.f44930a);
    }
}
