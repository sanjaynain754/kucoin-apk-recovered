package com.kubi.resources;

import android.widget.TextView;
import androidx.annotation.DrawableRes;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResViewEx.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/resources/ResViewEx;", "", "<init>", "()V", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ResViewEx {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f43501a = new Companion(null);

    /* JADX INFO: compiled from: ResViewEx.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/resources/ResViewEx$Companion;", "", "<init>", "()V", "setCompactTextCursorDrawable4Java", "", "textView", "Landroid/widget/TextView;", "resId", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void setCompactTextCursorDrawable4Java(@NotNull TextView textView, @DrawableRes int resId) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            C22912t.m54419q(textView, resId);
        }
    }
}
