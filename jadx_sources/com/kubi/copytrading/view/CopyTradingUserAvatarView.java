package com.kubi.copytrading.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$mipmap;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27094u0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingUserAvatarView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\f\u0010\r\u001a\u00020\u000b*\u00020\u000bH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/copytrading/view/CopyTradingUserAvatarView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setUserAvatar", "", "avatar", "", "nickName", "headText", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CopyTradingUserAvatarView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingUserAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.copy_trading_user_avatar, this);
    }

    /* JADX INFO: renamed from: a */
    public final String m20957a(String str) {
        Object objM103844constructorimpl;
        String upperCase;
        if (str == null || str.length() == 0) {
            return "KU";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (str.length() >= 2) {
                C27094u0 c27094u0 = C27094u0.f54451a;
                if (c27094u0.m66900b(strSubstring)) {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    String strSubstring2 = str.substring(1, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    if (c27094u0.m66900b(strSubstring2)) {
                        upperCase = strSubstring.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    } else {
                        String strSubstring3 = str.substring(0, 2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        upperCase = strSubstring3.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    }
                }
            } else {
                upperCase = strSubstring.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            objM103844constructorimpl = Result.m103844constructorimpl(upperCase);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return C27041f.m66669i((String) objM103844constructorimpl, "KU");
    }

    /* JADX INFO: renamed from: b */
    public final void m20958b(@Nullable String str, @Nullable String str2) {
        ImageView imageView = (ImageView) findViewById(R$id.ivAvatar);
        ShapeTextView shapeTextView = (ShapeTextView) findViewById(R$id.tvAvatar);
        C46338a.m102151a(getContext()).mo6634v(str).mo92186a0(200, 200).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.home_icon_mine_default_head)).m6594E0(imageView);
        shapeTextView.setText(C27041f.m66669i(str2 != null ? m20957a(str2) : null, "KU"));
        if (TextUtils.isEmpty(str)) {
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66577h(imageView);
            Intrinsics.checkNotNull(shapeTextView);
            ViewExtKt.m66594y(shapeTextView);
            return;
        }
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66594y(imageView);
        Intrinsics.checkNotNull(shapeTextView);
        ViewExtKt.m66577h(shapeTextView);
    }
}
