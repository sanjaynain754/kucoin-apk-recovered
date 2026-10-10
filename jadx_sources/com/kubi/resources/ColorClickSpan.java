package com.kubi.resources;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.kubi.utils.C27014a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ColorClickSpan.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B:\u0012%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R+\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/ColorClickSpan;", "Landroid/text/style/ClickableSpan;", "updateState", "Lkotlin/Function1;", "Landroid/text/TextPaint;", "Lkotlin/ParameterName;", "name", "ds", "", "onClickListener", "Landroid/view/View$OnClickListener;", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;)V", "onClick", "widget", "Landroid/view/View;", "updateDrawState", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ColorClickSpan extends ClickableSpan {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Function1<TextPaint, Unit> f43603b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final View.OnClickListener f43604c;

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        View.OnClickListener onClickListener;
        Intrinsics.checkNotNullParameter(widget, "widget");
        if (C27014a1.m66501a(widget) || (onClickListener = this.f43604c) == null) {
            return;
        }
        onClickListener.onClick(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        Function1<TextPaint, Unit> function1 = this.f43603b;
        if (function1 == null) {
            super.updateDrawState(ds2);
        } else {
            function1.invoke(ds2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColorClickSpan(@Nullable Function1<? super TextPaint, Unit> function1, @Nullable View.OnClickListener onClickListener) {
        this.f43603b = function1;
        this.f43604c = onClickListener;
    }
}
