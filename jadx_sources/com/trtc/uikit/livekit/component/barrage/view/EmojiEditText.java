package com.trtc.uikit.livekit.component.barrage.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import ed0.InterfaceC37135a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmojiEditText.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lcom/trtc/uikit/livekit/component/barrage/view/EmojiLayout$EmojiListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojiResource", "Lcom/trtc/uikit/livekit/component/barrage/viewmodel/IEmojiResource;", "emojiBounds", "Landroid/graphics/Rect;", "setEmojiResource", "", InterfaceC33617e1.f69660i, "onDelete", "onAddEmoji", "resId", "", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "MyInputConnectionWrapper", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EmojiEditText extends AppCompatEditText implements EmojiLayout.InterfaceC35894a {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC37135a f77653b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Rect f77654c;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.EmojiEditText$a */
    /* JADX INFO: compiled from: EmojiEditText.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiEditText$MyInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "<init>", "(Lcom/trtc/uikit/livekit/component/barrage/view/EmojiEditText;Landroid/view/inputmethod/InputConnection;Z)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C35893a extends InputConnectionWrapper {
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            if (beforeLength != 1 || afterLength != 0) {
                return super.deleteSurroundingText(beforeLength, afterLength);
            }
            EmojiEditText.this.onDelete();
            return true;
        }

        public C35893a(InputConnection inputConnection, boolean z11) {
            super(inputConnection, z11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public EmojiEditText(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmojiEditText(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.trtc.uikit.livekit.component.barrage.view.EmojiLayout.InterfaceC35894a
    /* JADX INFO: renamed from: b */
    public void mo79532b(int i11) {
        String strMo875b;
        InterfaceC37135a interfaceC37135a;
        InterfaceC37135a interfaceC37135a2 = this.f77653b;
        if (interfaceC37135a2 == null || (strMo875b = interfaceC37135a2.mo875b(i11)) == null || TextUtils.isEmpty(strMo875b) || (interfaceC37135a = this.f77653b) == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableMo874a = interfaceC37135a.mo874a(context, i11, this.f77654c);
        if (drawableMo874a == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            text = new SpannableStringBuilder();
        }
        text.insert(selectionStart, strMo875b);
        text.setSpan(new ImageSpan(drawableMo874a, strMo875b), selectionStart, strMo875b.length() + selectionStart, 33);
        setText(text);
        setSelection(selectionStart + strMo875b.length());
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        return new C35893a(super.onCreateInputConnection(outAttrs), true);
    }

    @Override // com.trtc.uikit.livekit.component.barrage.view.EmojiLayout.InterfaceC35894a
    public void onDelete() {
        onKeyDown(67, new KeyEvent(0, 67));
    }

    public final void setEmojiResource(@NotNull InterfaceC37135a resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f77653b = resource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmojiEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int iAbs = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        rect.right = iAbs;
        rect.bottom = iAbs;
        this.f77654c = rect;
    }
}
