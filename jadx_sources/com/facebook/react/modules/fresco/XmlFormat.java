package com.facebook.react.modules.fresco;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.facebook.imageformat.ImageFormat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p422l5.C42056c;
import p585r5.C43928c;
import p684v5.C45422c;
import p684v5.InterfaceC45421b;
import p714w5.InterfaceC45739a;
import p747x3.C45999a;
import p749x5.AbstractC46073g;
import p749x5.C46075i;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46080n;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: XmlFormat.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/XmlFormat;", "", "<init>", "()V", "Lv5/c$a;", "builder", "Landroid/content/Context;", "context", "addDecodingCapability", "(Lv5/c$a;Landroid/content/Context;)Lv5/c$a;", "Lw5/a;", "getDrawableFactory", "()Lw5/a;", "Lcom/facebook/imageformat/ImageFormat;", "FORMAT", "Lcom/facebook/imageformat/ImageFormat;", "", "TAG", "Ljava/lang/String;", "", "BINARY_XML_HEADER", "[B", "XmlFormatChecker", "CloseableXmlImage", "XmlFormatDecoder", "XmlDrawableFactory", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class XmlFormat {

    @NotNull
    private static final String TAG = "XmlFormat";

    @NotNull
    public static final XmlFormat INSTANCE = new XmlFormat();

    @NotNull
    private static final ImageFormat FORMAT = new ImageFormat("XML", "xml");

    @NotNull
    private static final byte[] BINARY_XML_HEADER = {3, 0, 8, 0};

    /* JADX INFO: compiled from: XmlFormat.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/XmlFormat$CloseableXmlImage;", "Lx5/g;", "", "name", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "", "getSizeInBytes", "()I", "", "close", "()V", "", "isClosed", "()Z", "getWidth", "getHeight", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "closed", "Z", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nXmlFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlFormat.kt\ncom/facebook/react/modules/fresco/XmlFormat$CloseableXmlImage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class CloseableXmlImage extends AbstractC46073g {
        private boolean closed;

        @NotNull
        private final Drawable drawable;

        @NotNull
        private final String name;

        @Override // p749x5.InterfaceC46071e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
        }

        public CloseableXmlImage(@NotNull String name, @NotNull Drawable drawable) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.name = name;
            this.drawable = drawable;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }

        @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
        public int getHeight() {
            Integer numValueOf = Integer.valueOf(this.drawable.getIntrinsicHeight());
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            return 0;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Override // p749x5.InterfaceC46071e, p749x5.InterfaceC46077k
        public int getWidth() {
            Integer numValueOf = Integer.valueOf(this.drawable.getIntrinsicWidth());
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            return 0;
        }

        @Override // p749x5.InterfaceC46071e
        /* JADX INFO: renamed from: isClosed, reason: from getter */
        public boolean getClosed() {
            return this.closed;
        }

        @Override // p749x5.InterfaceC46071e
        public int getSizeInBytes() {
            return getWidth() * getHeight() * 4;
        }
    }

    /* JADX INFO: compiled from: XmlFormat.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/XmlFormat$XmlDrawableFactory;", "Lw5/a;", "<init>", "()V", "Lx5/e;", "image", "", "supportsImageType", "(Lx5/e;)Z", "Landroid/graphics/drawable/Drawable;", "createDrawable", "(Lx5/e;)Landroid/graphics/drawable/Drawable;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class XmlDrawableFactory implements InterfaceC45739a {
        @Override // p714w5.InterfaceC45739a
        @Nullable
        public Drawable createDrawable(@NotNull InterfaceC46071e image) {
            Intrinsics.checkNotNullParameter(image, "image");
            return ((CloseableXmlImage) image).getDrawable();
        }

        @Override // p714w5.InterfaceC45739a
        public boolean supportsImageType(@NotNull InterfaceC46071e image) {
            Intrinsics.checkNotNullParameter(image, "image");
            return image instanceof CloseableXmlImage;
        }
    }

    /* JADX INFO: compiled from: XmlFormat.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatChecker;", "Lcom/facebook/imageformat/ImageFormat$a;", "<init>", "()V", "", "headerBytes", "", "headerSize", "Lcom/facebook/imageformat/ImageFormat;", "determineFormat", "([BI)Lcom/facebook/imageformat/ImageFormat;", "I", "getHeaderSize", "()I", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class XmlFormatChecker implements ImageFormat.InterfaceC5635a {
        private final int headerSize = XmlFormat.BINARY_XML_HEADER.length;

        @Override // com.facebook.imageformat.ImageFormat.InterfaceC5635a
        @NotNull
        public ImageFormat determineFormat(@NotNull byte[] headerBytes, int headerSize) {
            Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
            if (headerSize < XmlFormat.BINARY_XML_HEADER.length) {
                return ImageFormat.f8817d;
            }
            return C42056c.m92264c(headerBytes, XmlFormat.BINARY_XML_HEADER) ? XmlFormat.FORMAT : ImageFormat.f8817d;
        }

        @Override // com.facebook.imageformat.ImageFormat.InterfaceC5635a
        public int getHeaderSize() {
            return this.headerSize;
        }
    }

    /* JADX INFO: compiled from: XmlFormat.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/react/modules/fresco/XmlFormat$XmlFormatDecoder;", "Lv5/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "xmlResource", "", "parseImageSourceResourceId", "(Landroid/net/Uri;)I", "Lx5/i;", "encodedImage", SessionDescription.ATTR_LENGTH, "Lx5/n;", "qualityInfo", "Lr5/c;", "options", "Lx5/e;", "decode", "(Lx5/i;ILx5/n;Lr5/c;)Lx5/e;", "Landroid/content/Context;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class XmlFormatDecoder implements InterfaceC45421b {

        @NotNull
        private final Context context;

        public XmlFormatDecoder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        @Override // p684v5.InterfaceC45421b
        @Nullable
        public InterfaceC46071e decode(@NotNull C46075i encodedImage, int length, @NotNull InterfaceC46080n qualityInfo, @NotNull C43928c options) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            Intrinsics.checkNotNullParameter(qualityInfo, "qualityInfo");
            Intrinsics.checkNotNullParameter(options, "options");
            try {
                String strM101584u = encodedImage.m101584u();
                if (strM101584u == null) {
                    throw new IllegalStateException("No source in encoded image");
                }
                Uri uri = Uri.parse(strM101584u);
                Intrinsics.checkNotNull(uri);
                Drawable drawable = this.context.getApplicationContext().getResources().getDrawable(parseImageSourceResourceId(uri), null);
                Intrinsics.checkNotNull(drawable);
                return new CloseableXmlImage(strM101584u, drawable);
            } catch (Throwable th2) {
                C45999a.m101508n(XmlFormat.TAG, "Cannot decode xml " + th2, th2);
                return null;
            }
        }

        private final int parseImageSourceResourceId(Uri xmlResource) {
            Integer intOrNull;
            List<String> pathSegments = xmlResource.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            String str = (String) CollectionsKt.lastOrNull((List) pathSegments);
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                return intOrNull.intValue();
            }
            throw new IllegalStateException("Invalid resource id");
        }
    }

    @NotNull
    public final C45422c.a addDecodingCapability(@NotNull C45422c.a builder, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(context, "context");
        C45422c.a aVarM100384c = builder.m100384c(FORMAT, new XmlFormatChecker(), new XmlFormatDecoder(context));
        Intrinsics.checkNotNullExpressionValue(aVarM100384c, "addDecodingCapability(...)");
        return aVarM100384c;
    }

    @NotNull
    public final InterfaceC45739a getDrawableFactory() {
        return new XmlDrawableFactory();
    }

    private XmlFormat() {
    }
}
