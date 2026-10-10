package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class IntentSanitizer {
    private static final String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private Predicate<String> mAllowedActions;
    private Predicate<String> mAllowedCategories;
    private Predicate<ClipData> mAllowedClipData;
    private Predicate<Uri> mAllowedClipDataUri;
    private Predicate<ComponentName> mAllowedComponents;
    private Predicate<Uri> mAllowedData;
    private Map<String, Predicate<Object>> mAllowedExtras;
    private int mAllowedFlags;
    private Predicate<String> mAllowedPackages;
    private Predicate<String> mAllowedTypes;

    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private int mAllowedFlags;
        private Predicate<String> mAllowedActions = new Predicate() { // from class: androidx.core.content.m
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2304p((String) obj);
            }
        };
        private Predicate<Uri> mAllowedData = new Predicate() { // from class: androidx.core.content.n
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2300l((Uri) obj);
            }
        };
        private Predicate<String> mAllowedTypes = new Predicate() { // from class: androidx.core.content.o
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2290b((String) obj);
            }
        };
        private Predicate<String> mAllowedCategories = new Predicate() { // from class: androidx.core.content.p
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2299k((String) obj);
            }
        };
        private Predicate<String> mAllowedPackages = new Predicate() { // from class: androidx.core.content.q
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2294f((String) obj);
            }
        };
        private Predicate<ComponentName> mAllowedComponents = new Predicate() { // from class: androidx.core.content.r
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2289a((ComponentName) obj);
            }
        };
        private Map<String, Predicate<Object>> mAllowedExtras = new HashMap();
        private boolean mAllowClipDataText = false;
        private Predicate<Uri> mAllowedClipDataUri = new Predicate() { // from class: androidx.core.content.s
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2301m((Uri) obj);
            }
        };
        private Predicate<ClipData> mAllowedClipData = new Predicate() { // from class: androidx.core.content.t
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m2305q((ClipData) obj);
            }
        };

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m2289a(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m2290b(String str) {
            return false;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ boolean m2294f(String str) {
            return false;
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ boolean m2297i(Object obj) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ boolean m2298j(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ boolean m2299k(String str) {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ boolean m2300l(Uri uri) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ boolean m2301m(Uri uri) {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ boolean m2303o(Object obj) {
            return true;
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ boolean m2304p(String str) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ boolean m2305q(ClipData clipData) {
            return false;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new C1565d(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new Predicate() { // from class: androidx.core.content.i
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m2298j((ComponentName) obj);
                }
            };
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new C1565d(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull final ComponentName componentName) {
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new Predicate() { // from class: androidx.core.content.h
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, new Predicate() { // from class: androidx.core.content.u
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m2303o(obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull final String str) {
            allowExtra("output", Uri.class, new Predicate() { // from class: androidx.core.content.c
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new C1565d(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new C1565d(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> Builder allowExtra(@NonNull String str, @NonNull final Class<T> cls, @NonNull final Predicate<T> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, new Predicate() { // from class: androidx.core.content.g
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m2293e(cls, predicate, obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull Predicate<Uri> predicate) {
            allowExtra("output", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStream(@NonNull Predicate<Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowFlags(int i11) {
            this.mAllowedFlags = i11 | this.mAllowedFlags;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        @NonNull
        public IntentSanitizer build() {
            boolean z11 = this.mAllowAnyComponent;
            if ((z11 && this.mAllowSomeComponents) || (!z11 && !this.mAllowSomeComponents)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer = new IntentSanitizer();
            intentSanitizer.mAllowedFlags = this.mAllowedFlags;
            intentSanitizer.mAllowedActions = this.mAllowedActions;
            intentSanitizer.mAllowedData = this.mAllowedData;
            intentSanitizer.mAllowedTypes = this.mAllowedTypes;
            intentSanitizer.mAllowedCategories = this.mAllowedCategories;
            intentSanitizer.mAllowedPackages = this.mAllowedPackages;
            intentSanitizer.mAllowAnyComponent = this.mAllowAnyComponent;
            intentSanitizer.mAllowedComponents = this.mAllowedComponents;
            intentSanitizer.mAllowedExtras = this.mAllowedExtras;
            intentSanitizer.mAllowClipDataText = this.mAllowClipDataText;
            intentSanitizer.mAllowedClipDataUri = this.mAllowedClipDataUri;
            intentSanitizer.mAllowedClipData = this.mAllowedClipData;
            intentSanitizer.mAllowIdentifier = this.mAllowIdentifier;
            intentSanitizer.mAllowSelector = this.mAllowSelector;
            intentSanitizer.mAllowSourceBounds = this.mAllowSourceBounds;
            return intentSanitizer;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ boolean m2293e(Class cls, Predicate predicate, Object obj) {
            if (cls.isInstance(obj) && predicate.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedActions = this.mAllowedActions.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedCategories = this.mAllowedCategories.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipData(@NonNull Predicate<ClipData> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipData = this.mAllowedClipData.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUri(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new Predicate() { // from class: androidx.core.content.j
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull Predicate<ComponentName> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponentWithPackage(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowComponent(new Predicate() { // from class: androidx.core.content.e
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return str.equals(((ComponentName) obj).getPackageName());
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowData(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedData = this.mAllowedData.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowDataWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowData(new Predicate() { // from class: androidx.core.content.f
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStreamUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new Predicate() { // from class: androidx.core.content.l
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedPackages = this.mAllowedPackages.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedTypes = this.mAllowedTypes.m2473or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Predicate<Object> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate<Object> predicate2 = this.mAllowedExtras.get(str);
            if (predicate2 == null) {
                predicate2 = new Predicate() { // from class: androidx.core.content.k
                    @Override // androidx.core.util.Predicate
                    public final boolean test(Object obj) {
                        return IntentSanitizer.Builder.m2297i(obj);
                    }
                };
            }
            this.mAllowedExtras.put(str, predicate2.m2473or(predicate));
            return this;
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static String getIdentifier(Intent intent) {
            return intent.getIdentifier();
        }

        public static Intent setIdentifier(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static void checkOtherMembers(int i11, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            consumer.accept("ClipData item at position " + i11 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    private IntentSanitizer() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2287a(String str) {
        throw new SecurityException(str);
    }

    private void putExtra(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @NonNull
    public Intent sanitize(@NonNull Intent intent, @NonNull Consumer<String> consumer) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.mAllowAnyComponent && component == null) || this.mAllowedComponents.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.mAllowedPackages.test(str)) {
            intent2.setPackage(str);
        } else {
            consumer.accept("Package is not allowed: " + str);
        }
        int flags = this.mAllowedFlags | intent.getFlags();
        int i11 = this.mAllowedFlags;
        if (flags == i11) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i11);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.mAllowedFlags)));
        }
        String action = intent.getAction();
        if (action == null || this.mAllowedActions.test(action)) {
            intent2.setAction(action);
        } else {
            consumer.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.mAllowedData.test(data)) {
            intent2.setData(data);
        } else {
            consumer.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.mAllowedTypes.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            consumer.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.mAllowedCategories.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.mAllowedFlags & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.mAllowedFlags) & 3) == 0) {
                    Object obj = extras.get(str3);
                    Predicate<Object> predicate = this.mAllowedExtras.get(str3);
                    if (predicate == null || !predicate.test(obj)) {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        putExtra(intent2, str3, obj);
                    }
                } else {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        sanitizeClipData(intent, intent2, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, consumer);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mAllowIdentifier) {
                Api29Impl.setIdentifier(intent2, Api29Impl.getIdentifier(intent));
            } else if (Api29Impl.getIdentifier(intent) != null) {
                consumer.accept("Identifier is not allowed: " + Api29Impl.getIdentifier(intent));
            }
        }
        if (this.mAllowSelector) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            consumer.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.mAllowSourceBounds) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: androidx.core.content.b
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m2288b((String) obj);
            }
        });
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: androidx.core.content.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m2287a((String) obj);
            }
        });
    }

    private static void checkOtherMembers(int i11, ClipData.Item item, Consumer<String> consumer) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        consumer.accept("ClipData item at position " + i11 + " contains htmlText, textLinks or intent: " + item);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    public static void sanitizeClipData(@NonNull Intent intent, Intent intent2, Predicate<ClipData> predicate, boolean z11, Predicate<Uri> predicate2, Consumer<String> consumer) {
        CharSequence text;
        Uri uri;
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (predicate != null && predicate.test(clipData)) {
                intent2.setClipData(clipData);
                return;
            }
            ClipData clipData2 = null;
            for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                ClipData.Item itemAt = clipData.getItemAt(i11);
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.checkOtherMembers(i11, itemAt, consumer);
                } else {
                    checkOtherMembers(i11, itemAt, consumer);
                }
                if (z11) {
                    text = itemAt.getText();
                } else {
                    if (itemAt.getText() != null) {
                        consumer.accept("Item text cannot contain value. Item position: " + i11 + ". Text: " + ((Object) itemAt.getText()));
                    }
                    text = null;
                }
                if (predicate2 == null) {
                    if (itemAt.getUri() != null) {
                        consumer.accept("Item URI is not allowed. Item position: " + i11 + ". URI: " + itemAt.getUri());
                    }
                } else {
                    if (itemAt.getUri() != null && !predicate2.test(itemAt.getUri())) {
                        consumer.accept("Item URI is not allowed. Item position: " + i11 + ". URI: " + itemAt.getUri());
                    } else {
                        uri = itemAt.getUri();
                    }
                    if (text == null || uri != null) {
                        if (clipData2 == null) {
                            clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                        } else {
                            clipData2.addItem(new ClipData.Item(text, null, uri));
                        }
                    }
                }
                uri = null;
                if (text == null) {
                    if (clipData2 == null) {
                        clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new ClipData.Item(text, null, uri));
                    }
                } else if (clipData2 == null) {
                    clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                } else {
                    clipData2.addItem(new ClipData.Item(text, null, uri));
                }
            }
            if (clipData2 != null) {
                intent2.setClipData(clipData2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2288b(String str) {
    }
}
