package com.jumio.core.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import com.jumio.commons.log.Log;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/core/util/ClickableSpan;", "Landroid/text/style/ClickableSpan;", "Ljava/io/Serializable;", "consentUrl", "", "linkColor", "", "<init>", "(Ljava/lang/String;I)V", "getConsentUrl$jumio_core_release", "()Ljava/lang/String;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "openConsentUrl", "context", "Landroid/content/Context;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClickableSpan extends android.text.style.ClickableSpan implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f14577a;

    /* JADX INFO: renamed from: b */
    public final int f14578b;

    public ClickableSpan(@NotNull String consentUrl, int i11) {
        Intrinsics.checkNotNullParameter(consentUrl, "consentUrl");
        this.f14577a = consentUrl;
        this.f14578b = i11;
    }

    public /* synthetic */ ClickableSpan(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 0 : i11);
    }

    @NotNull
    /* JADX INFO: renamed from: getConsentUrl$jumio_core_release, reason: from getter */
    public final String getF14577a() {
        return this.f14577a;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Context context = widget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f14577a));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.m14482w("Activity was not found for intent, " + intent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setUnderlineText(true);
        int i11 = this.f14578b;
        if (i11 != 0) {
            ds2.setColor(i11);
        }
    }
}
