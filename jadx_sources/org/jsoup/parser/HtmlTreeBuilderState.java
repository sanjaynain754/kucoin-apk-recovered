package org.jsoup.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.Constants;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import oh0.C43093c;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43183a;
import org.jsoup.nodes.C43184b;
import org.jsoup.nodes.C43188f;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.tensorflow.lite.schema.BuiltinOptions;
import ph0.C43480b;

/* JADX INFO: loaded from: classes61.dex */
enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                return true;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
            } else if (token.m95029i()) {
                Token.C43223e c43223eM95023c = token.m95023c();
                C43188f c43188f = new C43188f(c43296b.f95536h.m95186c(c43223eM95023c.m95041p()), c43223eM95023c.m95043r(), c43223eM95023c.m95044s());
                c43188f.m94966d0(c43223eM95023c.m95042q());
                c43296b.m95180y().m94875f0(c43188f);
                if (c43223eM95023c.m95045t()) {
                    c43296b.m95180y().m94817w1(Document.QuirksMode.quirks);
                }
                c43296b.m95115D0(HtmlTreeBuilderState.BeforeHtml);
            } else {
                c43296b.m95115D0(HtmlTreeBuilderState.BeforeHtml);
                return c43296b.mo95147g(token);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, C43296b c43296b) {
            c43296b.m95135X("html");
            c43296b.m95115D0(HtmlTreeBuilderState.BeforeHead);
            return c43296b.mo95147g(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return false;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("html")) {
                c43296b.m95125N(token.m95025e());
                c43296b.m95115D0(HtmlTreeBuilderState.BeforeHead);
                return true;
            }
            if (token.m95031k() && C43093c.m94685d(token.m95024d().m95051D(), C43218b.f95409e)) {
                return anythingElse(token, c43296b);
            }
            if (token.m95031k()) {
                c43296b.m95166r(this);
                return false;
            }
            return anythingElse(token, c43296b);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return false;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("html")) {
                return HtmlTreeBuilderState.InBody.process(token, c43296b);
            }
            if (token.m95032l() && token.m95025e().m95051D().equals(TtmlNode.TAG_HEAD)) {
                c43296b.m95111B0(c43296b.m95125N(token.m95025e()));
                c43296b.m95115D0(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (token.m95031k() && C43093c.m94685d(token.m95024d().m95051D(), C43218b.f95409e)) {
                c43296b.m95256i(TtmlNode.TAG_HEAD);
                return c43296b.mo95147g(token);
            }
            if (token.m95031k()) {
                c43296b.m95166r(this);
                return false;
            }
            c43296b.m95256i(TtmlNode.TAG_HEAD);
            return c43296b.mo95147g(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        /* JADX INFO: renamed from: e */
        private boolean m95016e(Token token, AbstractC43303i abstractC43303i) {
            abstractC43303i.m95255h(TtmlNode.TAG_HEAD);
            return abstractC43303i.mo95147g(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            int i11 = C43217a.f95392a[token.f95431a.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return m95016e(token, c43296b);
                        }
                        String strM95051D = token.m95024d().m95051D();
                        if (strM95051D.equals(TtmlNode.TAG_HEAD)) {
                            c43296b.m95153k0();
                            c43296b.m95115D0(HtmlTreeBuilderState.AfterHead);
                        } else {
                            if (C43093c.m94685d(strM95051D, C43218b.f95407c)) {
                                return m95016e(token, c43296b);
                            }
                            c43296b.m95166r(this);
                            return false;
                        }
                    } else {
                        Token.C43226h c43226hM95025e = token.m95025e();
                        String strM95051D2 = c43226hM95025e.m95051D();
                        if (strM95051D2.equals("html")) {
                            return HtmlTreeBuilderState.InBody.process(token, c43296b);
                        }
                        if (C43093c.m94685d(strM95051D2, C43218b.f95405a)) {
                            Element elementM95129R = c43296b.m95129R(c43226hM95025e);
                            if (strM95051D2.equals(TtmlNode.RUBY_BASE) && elementM95129R.mo94962v("href")) {
                                c43296b.m95148g0(elementM95129R);
                            }
                        } else if (strM95051D2.equals("meta")) {
                            c43296b.m95129R(c43226hM95025e);
                        } else if (strM95051D2.equals("title")) {
                            HtmlTreeBuilderState.m95009b(c43226hM95025e, c43296b);
                        } else if (C43093c.m94685d(strM95051D2, C43218b.f95406b)) {
                            HtmlTreeBuilderState.m95008a(c43226hM95025e, c43296b);
                        } else if (strM95051D2.equals("noscript")) {
                            c43296b.m95125N(c43226hM95025e);
                            c43296b.m95115D0(HtmlTreeBuilderState.InHeadNoscript);
                        } else if (strM95051D2.equals("script")) {
                            c43296b.f95531c.m95251v(TokeniserState.ScriptData);
                            c43296b.m95146f0();
                            c43296b.m95115D0(HtmlTreeBuilderState.Text);
                            c43296b.m95125N(c43226hM95025e);
                        } else {
                            if (strM95051D2.equals(TtmlNode.TAG_HEAD)) {
                                c43296b.m95166r(this);
                                return false;
                            }
                            return m95016e(token, c43296b);
                        }
                    }
                } else {
                    c43296b.m95166r(this);
                    return false;
                }
            } else {
                c43296b.m95128Q(token.m95022b());
            }
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, C43296b c43296b) {
            c43296b.m95166r(this);
            c43296b.m95127P(new Token.C43221c().m95035p(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return true;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("html")) {
                return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.m95031k() && token.m95024d().m95051D().equals("noscript")) {
                c43296b.m95153k0();
                c43296b.m95115D0(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (!HtmlTreeBuilderState.m95011d(token) && !token.m95028h() && (!token.m95032l() || !C43093c.m94685d(token.m95025e().m95051D(), C43218b.f95410f))) {
                if (token.m95031k() && token.m95024d().m95051D().equals("br")) {
                    return anythingElse(token, c43296b);
                }
                if ((token.m95032l() && C43093c.m94685d(token.m95025e().m95051D(), C43218b.f95403K)) || token.m95031k()) {
                    c43296b.m95166r(this);
                    return false;
                }
                return anythingElse(token, c43296b);
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, C43296b c43296b) {
            c43296b.m95256i(TtmlNode.TAG_BODY);
            c43296b.m95168s(true);
            return c43296b.mo95147g(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return true;
            }
            if (token.m95032l()) {
                Token.C43226h c43226hM95025e = token.m95025e();
                String strM95051D = c43226hM95025e.m95051D();
                if (strM95051D.equals("html")) {
                    return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
                }
                if (strM95051D.equals(TtmlNode.TAG_BODY)) {
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95168s(false);
                    c43296b.m95115D0(HtmlTreeBuilderState.InBody);
                    return true;
                }
                if (strM95051D.equals("frameset")) {
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InFrameset);
                    return true;
                }
                if (C43093c.m94685d(strM95051D, C43218b.f95411g)) {
                    c43296b.m95166r(this);
                    Element elementM95110B = c43296b.m95110B();
                    c43296b.m95163p0(elementM95110B);
                    c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
                    c43296b.m95171t0(elementM95110B);
                    return true;
                }
                if (strM95051D.equals(TtmlNode.TAG_HEAD)) {
                    c43296b.m95166r(this);
                    return false;
                }
                anythingElse(token, c43296b);
                return true;
            }
            if (token.m95031k()) {
                if (C43093c.m94685d(token.m95024d().m95051D(), C43218b.f95408d)) {
                    anythingElse(token, c43296b);
                    return true;
                }
                c43296b.m95166r(this);
                return false;
            }
            anythingElse(token, c43296b);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        /* JADX INFO: renamed from: e */
        public final boolean m95017e(Token token, C43296b c43296b) {
            Token.C43225g c43225gM95024d = token.m95024d();
            String strM95051D = c43225gM95024d.m95051D();
            strM95051D.getClass();
            switch (strM95051D) {
                case "p":
                    if (!c43296b.m95116E(strM95051D)) {
                        c43296b.m95166r(this);
                        c43296b.m95256i(strM95051D);
                        return c43296b.mo95147g(c43225gM95024d);
                    }
                    c43296b.m95174v(strM95051D);
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95157m0(strM95051D);
                    return true;
                case "br":
                    c43296b.m95166r(this);
                    c43296b.m95256i("br");
                    return false;
                case "dd":
                case "dt":
                    if (!c43296b.m95118G(strM95051D)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95174v(strM95051D);
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95157m0(strM95051D);
                    return true;
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    String[] strArr = C43218b.f95413i;
                    if (!c43296b.m95120I(strArr)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95174v(strM95051D);
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95159n0(strArr);
                    return true;
                case "li":
                    if (!c43296b.m95117F(strM95051D)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95174v(strM95051D);
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95157m0(strM95051D);
                    return true;
                case "body":
                    if (c43296b.m95118G(TtmlNode.TAG_BODY)) {
                        c43296b.m95115D0(HtmlTreeBuilderState.AfterBody);
                        return true;
                    }
                    c43296b.m95166r(this);
                    return false;
                case "form":
                    C43480b c43480bM95182z = c43296b.m95182z();
                    c43296b.m95183z0(null);
                    if (c43480bM95182z == null || !c43296b.m95118G(strM95051D)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95172u();
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95171t0(c43480bM95182z);
                    return true;
                case "html":
                    if (c43296b.m95255h(TtmlNode.TAG_BODY)) {
                        return c43296b.mo95147g(c43225gM95024d);
                    }
                    return true;
                case "span":
                case "sarcasm":
                    return anyOtherEndTag(token, c43296b);
                default:
                    if (C43093c.m94685d(strM95051D, C43218b.f95423s)) {
                        return m95018f(token, c43296b);
                    }
                    if (C43093c.m94685d(strM95051D, C43218b.f95422r)) {
                        if (!c43296b.m95118G(strM95051D)) {
                            c43296b.m95166r(this);
                            return false;
                        }
                        c43296b.m95172u();
                        if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                            c43296b.m95166r(this);
                        }
                        c43296b.m95157m0(strM95051D);
                    } else {
                        if (!C43093c.m94685d(strM95051D, C43218b.f95417m)) {
                            return anyOtherEndTag(token, c43296b);
                        }
                        if (!c43296b.m95118G("name")) {
                            if (!c43296b.m95118G(strM95051D)) {
                                c43296b.m95166r(this);
                                return false;
                            }
                            c43296b.m95172u();
                            if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                                c43296b.m95166r(this);
                            }
                            c43296b.m95157m0(strM95051D);
                            c43296b.m95156m();
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:277:0x050f  */
        /* JADX WARN: Code duplicated, block: B:303:0x059b  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: g */
        public final boolean m95019g(Token token, C43296b c43296b) {
            byte b11;
            Token.C43226h c43226hM95025e = token.m95025e();
            String strM95051D = c43226hM95025e.m95051D();
            strM95051D.getClass();
            switch (strM95051D.hashCode()) {
                case -1644953643:
                    b11 = strM95051D.equals("frameset") ? (byte) 0 : (byte) -1;
                    break;
                case -1377687758:
                    b11 = strM95051D.equals("button") ? (byte) 1 : (byte) -1;
                    break;
                case -1191214428:
                    b11 = strM95051D.equals("iframe") ? (byte) 2 : (byte) -1;
                    break;
                case -1010136971:
                    b11 = strM95051D.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT) ? (byte) 3 : (byte) -1;
                    break;
                case -1003243718:
                    b11 = strM95051D.equals("textarea") ? (byte) 4 : (byte) -1;
                    break;
                case -906021636:
                    b11 = strM95051D.equals("select") ? (byte) 5 : (byte) -1;
                    break;
                case -80773204:
                    b11 = strM95051D.equals("optgroup") ? (byte) 6 : (byte) -1;
                    break;
                case 97:
                    b11 = strM95051D.equals(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY) ? (byte) 7 : (byte) -1;
                    break;
                case 3200:
                    b11 = strM95051D.equals("dd") ? (byte) 8 : (byte) -1;
                    break;
                case 3216:
                    b11 = strM95051D.equals("dt") ? (byte) 9 : (byte) -1;
                    break;
                case 3273:
                    b11 = strM95051D.equals("h1") ? (byte) 10 : (byte) -1;
                    break;
                case 3274:
                    b11 = strM95051D.equals("h2") ? (byte) 11 : (byte) -1;
                    break;
                case 3275:
                    b11 = strM95051D.equals("h3") ? (byte) 12 : (byte) -1;
                    break;
                case 3276:
                    b11 = strM95051D.equals("h4") ? (byte) 13 : (byte) -1;
                    break;
                case 3277:
                    b11 = strM95051D.equals("h5") ? (byte) 14 : (byte) -1;
                    break;
                case 3278:
                    b11 = strM95051D.equals("h6") ? (byte) 15 : (byte) -1;
                    break;
                case 3338:
                    b11 = strM95051D.equals("hr") ? (byte) 16 : (byte) -1;
                    break;
                case 3453:
                    b11 = strM95051D.equals("li") ? (byte) 17 : (byte) -1;
                    break;
                case 3646:
                    b11 = strM95051D.equals("rp") ? (byte) 18 : (byte) -1;
                    break;
                case 3650:
                    b11 = strM95051D.equals("rt") ? (byte) 19 : (byte) -1;
                    break;
                case 111267:
                    b11 = strM95051D.equals("pre") ? (byte) 20 : (byte) -1;
                    break;
                case 114276:
                    b11 = strM95051D.equals("svg") ? (byte) 21 : (byte) -1;
                    break;
                case 118811:
                    b11 = strM95051D.equals("xmp") ? (byte) 22 : (byte) -1;
                    break;
                case 3029410:
                    b11 = strM95051D.equals(TtmlNode.TAG_BODY) ? (byte) 23 : (byte) -1;
                    break;
                case 3148996:
                    b11 = strM95051D.equals("form") ? (byte) 24 : (byte) -1;
                    break;
                case 3213227:
                    b11 = strM95051D.equals("html") ? (byte) 25 : (byte) -1;
                    break;
                case 3344136:
                    b11 = strM95051D.equals("math") ? (byte) 26 : (byte) -1;
                    break;
                case 3386833:
                    b11 = strM95051D.equals("nobr") ? (byte) 27 : (byte) -1;
                    break;
                case 3536714:
                    b11 = strM95051D.equals(TtmlNode.TAG_SPAN) ? (byte) 28 : (byte) -1;
                    break;
                case 100313435:
                    b11 = strM95051D.equals("image") ? (byte) 29 : (byte) -1;
                    break;
                case 100358090:
                    b11 = strM95051D.equals("input") ? (byte) 30 : (byte) -1;
                    break;
                case 110115790:
                    b11 = strM95051D.equals("table") ? (byte) 31 : (byte) -1;
                    break;
                case 181975684:
                    b11 = strM95051D.equals("listing") ? (byte) 32 : (byte) -1;
                    break;
                case 1973234167:
                    b11 = strM95051D.equals("plaintext") ? BuiltinOptions.ExpOptions : (byte) -1;
                    break;
                case 2091304424:
                    b11 = strM95051D.equals("isindex") ? BuiltinOptions.TopKV2Options : (byte) -1;
                    break;
                case 2115613112:
                    b11 = strM95051D.equals("noembed") ? BuiltinOptions.SplitOptions : (byte) -1;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            switch (b11) {
                case 0:
                    c43296b.m95166r(this);
                    ArrayList<Element> arrayListM95114D = c43296b.m95114D();
                    if (arrayListM95114D.size() == 1) {
                        return false;
                    }
                    if ((arrayListM95114D.size() > 2 && !arrayListM95114D.get(1).m94853L0().equals(TtmlNode.TAG_BODY)) || !c43296b.m95170t()) {
                        return false;
                    }
                    Element element = arrayListM95114D.get(1);
                    if (element.mo94848H() != null) {
                        element.m94974L();
                    }
                    while (arrayListM95114D.size() > 1) {
                        arrayListM95114D.remove(arrayListM95114D.size() - 1);
                    }
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InFrameset);
                    return true;
                case 1:
                    if (c43296b.m95116E("button")) {
                        c43296b.m95166r(this);
                        c43296b.m95255h("button");
                        c43296b.mo95147g(c43226hM95025e);
                    } else {
                        c43296b.m95167r0();
                        c43296b.m95125N(c43226hM95025e);
                        c43296b.m95168s(false);
                    }
                    return true;
                case 2:
                    c43296b.m95168s(false);
                    HtmlTreeBuilderState.m95008a(c43226hM95025e, c43296b);
                    return true;
                case 3:
                case 6:
                    if (c43296b.m95252a().m94853L0().equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                        c43296b.m95255h(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT);
                    }
                    c43296b.m95167r0();
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 4:
                    c43296b.m95125N(c43226hM95025e);
                    if (!c43226hM95025e.m95063z()) {
                        c43296b.f95531c.m95251v(TokeniserState.Rcdata);
                        c43296b.m95146f0();
                        c43296b.m95168s(false);
                        c43296b.m95115D0(HtmlTreeBuilderState.Text);
                    }
                    return true;
                case 5:
                    c43296b.m95167r0();
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95168s(false);
                    HtmlTreeBuilderState htmlTreeBuilderStateM95113C0 = c43296b.m95113C0();
                    if (htmlTreeBuilderStateM95113C0.equals(HtmlTreeBuilderState.InTable) || htmlTreeBuilderStateM95113C0.equals(HtmlTreeBuilderState.InCaption) || htmlTreeBuilderStateM95113C0.equals(HtmlTreeBuilderState.InTableBody) || htmlTreeBuilderStateM95113C0.equals(HtmlTreeBuilderState.InRow) || htmlTreeBuilderStateM95113C0.equals(HtmlTreeBuilderState.InCell)) {
                        c43296b.m95115D0(HtmlTreeBuilderState.InSelectInTable);
                    } else {
                        c43296b.m95115D0(HtmlTreeBuilderState.InSelect);
                    }
                    return true;
                case 7:
                    if (c43296b.m95176w(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY) != null) {
                        c43296b.m95166r(this);
                        c43296b.m95255h(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                        Element elementM95108A = c43296b.m95108A(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                        if (elementM95108A != null) {
                            c43296b.m95169s0(elementM95108A);
                            c43296b.m95171t0(elementM95108A);
                        }
                    }
                    c43296b.m95167r0();
                    c43296b.m95165q0(c43296b.m95125N(c43226hM95025e));
                    return true;
                case 8:
                case 9:
                    c43296b.m95168s(false);
                    ArrayList<Element> arrayListM95114D2 = c43296b.m95114D();
                    for (int size = arrayListM95114D2.size() - 1; size > 0; size--) {
                        Element element2 = arrayListM95114D2.get(size);
                        if (C43093c.m94685d(element2.m94853L0(), C43218b.f95415k)) {
                            c43296b.m95255h(element2.m94853L0());
                        } else if (!c43296b.m95143d0(element2) || C43093c.m94685d(element2.m94853L0(), C43218b.f95414j)) {
                        }
                        if (c43296b.m95116E("p")) {
                            c43296b.m95255h("p");
                        }
                        c43296b.m95125N(c43226hM95025e);
                        return true;
                    }
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    if (C43093c.m94685d(c43296b.m95252a().m94853L0(), C43218b.f95413i)) {
                        c43296b.m95166r(this);
                        c43296b.m95153k0();
                    }
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 16:
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95129R(c43226hM95025e);
                    c43296b.m95168s(false);
                    return true;
                case 17:
                    c43296b.m95168s(false);
                    ArrayList<Element> arrayListM95114D3 = c43296b.m95114D();
                    for (int size2 = arrayListM95114D3.size() - 1; size2 > 0; size2--) {
                        Element element3 = arrayListM95114D3.get(size2);
                        if (element3.m94853L0().equals("li")) {
                            c43296b.m95255h("li");
                        } else if (!c43296b.m95143d0(element3) || C43093c.m94685d(element3.m94853L0(), C43218b.f95414j)) {
                        }
                        if (c43296b.m95116E("p")) {
                            c43296b.m95255h("p");
                        }
                        c43296b.m95125N(c43226hM95025e);
                        return true;
                    }
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 18:
                case 19:
                    if (c43296b.m95118G(TtmlNode.ATTR_TTS_RUBY)) {
                        c43296b.m95172u();
                        if (!c43296b.m95252a().m94853L0().equals(TtmlNode.ATTR_TTS_RUBY)) {
                            c43296b.m95166r(this);
                            c43296b.m95155l0(TtmlNode.ATTR_TTS_RUBY);
                        }
                        c43296b.m95125N(c43226hM95025e);
                    }
                    return true;
                case 20:
                case 32:
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.f95530b.m95104w(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    c43296b.m95168s(false);
                    return true;
                case 21:
                    c43296b.m95167r0();
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 22:
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95167r0();
                    c43296b.m95168s(false);
                    HtmlTreeBuilderState.m95008a(c43226hM95025e, c43296b);
                    return true;
                case 23:
                    c43296b.m95166r(this);
                    ArrayList<Element> arrayListM95114D4 = c43296b.m95114D();
                    if (arrayListM95114D4.size() == 1) {
                        return false;
                    }
                    if (arrayListM95114D4.size() > 2 && !arrayListM95114D4.get(1).m94853L0().equals(TtmlNode.TAG_BODY)) {
                        return false;
                    }
                    c43296b.m95168s(false);
                    Element element4 = arrayListM95114D4.get(1);
                    for (C43183a c43183a : c43226hM95025e.m95062y()) {
                        if (!element4.mo94962v(c43183a.getKey())) {
                            element4.mo94878h().m94935H(c43183a);
                        }
                    }
                    return true;
                case 24:
                    if (c43296b.m95182z() != null) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95130S(c43226hM95025e, true);
                    return true;
                case 25:
                    c43296b.m95166r(this);
                    Element element5 = c43296b.m95114D().get(0);
                    for (C43183a c43183a2 : c43226hM95025e.m95062y()) {
                        if (!element5.mo94962v(c43183a2.getKey())) {
                            element5.mo94878h().m94935H(c43183a2);
                        }
                    }
                    return true;
                case 26:
                    c43296b.m95167r0();
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 27:
                    c43296b.m95167r0();
                    if (c43296b.m95118G("nobr")) {
                        c43296b.m95166r(this);
                        c43296b.m95255h("nobr");
                        c43296b.m95167r0();
                    }
                    c43296b.m95165q0(c43296b.m95125N(c43226hM95025e));
                    return true;
                case 28:
                    c43296b.m95167r0();
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 29:
                    if (c43296b.m95108A("svg") == null) {
                        return c43296b.mo95147g(c43226hM95025e.m95049B("img"));
                    }
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                case 30:
                    c43296b.m95167r0();
                    if (!c43296b.m95129R(c43226hM95025e).mo94960f("type").equalsIgnoreCase(ViewProps.HIDDEN)) {
                        c43296b.m95168s(false);
                    }
                    return true;
                case 31:
                    if (c43296b.m95180y().m94816v1() != Document.QuirksMode.quirks && c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95168s(false);
                    c43296b.m95115D0(HtmlTreeBuilderState.InTable);
                    return true;
                case 33:
                    if (c43296b.m95116E("p")) {
                        c43296b.m95255h("p");
                    }
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.f95531c.m95251v(TokeniserState.PLAINTEXT);
                    return true;
                case 34:
                    c43296b.m95166r(this);
                    if (c43296b.m95182z() != null) {
                        return false;
                    }
                    c43296b.m95256i("form");
                    if (c43226hM95025e.f95450j.m94948n(TUIConstants.TIMPush.NOTIFICATION.ACTION)) {
                        c43296b.m95182z().m94882j0(TUIConstants.TIMPush.NOTIFICATION.ACTION, c43226hM95025e.f95450j.m94946l(TUIConstants.TIMPush.NOTIFICATION.ACTION));
                    }
                    c43296b.m95256i("hr");
                    c43296b.m95256i(Constants.ScionAnalytics.PARAM_LABEL);
                    c43296b.mo95147g(new Token.C43221c().m95035p(c43226hM95025e.f95450j.m94948n("prompt") ? c43226hM95025e.f95450j.m94946l("prompt") : "This is a searchable index. Enter search keywords: "));
                    C43184b c43184b = new C43184b();
                    for (C43183a c43183a3 : c43226hM95025e.f95450j) {
                        if (!C43093c.m94685d(c43183a3.getKey(), C43218b.f95420p)) {
                            c43184b.m94935H(c43183a3);
                        }
                    }
                    c43184b.m94934G("name", "isindex");
                    c43296b.mo95151j("input", c43184b);
                    c43296b.m95255h(Constants.ScionAnalytics.PARAM_LABEL);
                    c43296b.m95256i("hr");
                    c43296b.m95255h("form");
                    return true;
                case 35:
                    HtmlTreeBuilderState.m95008a(c43226hM95025e, c43296b);
                    return true;
                default:
                    if (C43093c.m94685d(strM95051D, C43218b.f95418n)) {
                        c43296b.m95167r0();
                        c43296b.m95129R(c43226hM95025e);
                        c43296b.m95168s(false);
                    } else if (C43093c.m94685d(strM95051D, C43218b.f95412h)) {
                        if (c43296b.m95116E("p")) {
                            c43296b.m95255h("p");
                        }
                        c43296b.m95125N(c43226hM95025e);
                    } else {
                        if (C43093c.m94685d(strM95051D, C43218b.f95411g)) {
                            return c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
                        }
                        if (C43093c.m94685d(strM95051D, C43218b.f95416l)) {
                            c43296b.m95167r0();
                            c43296b.m95165q0(c43296b.m95125N(c43226hM95025e));
                        } else {
                            if (!C43093c.m94685d(strM95051D, C43218b.f95417m)) {
                                if (C43093c.m94685d(strM95051D, C43218b.f95419o)) {
                                    c43296b.m95129R(c43226hM95025e);
                                } else {
                                    if (C43093c.m94685d(strM95051D, C43218b.f95421q)) {
                                        c43296b.m95166r(this);
                                        return false;
                                    }
                                    c43296b.m95167r0();
                                    c43296b.m95125N(c43226hM95025e);
                                }
                                return true;
                            }
                            c43296b.m95167r0();
                            c43296b.m95125N(c43226hM95025e);
                            c43296b.m95132U();
                            c43296b.m95168s(false);
                        }
                    }
                    return true;
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            int i11 = C43217a.f95392a[token.f95431a.ordinal()];
            if (i11 == 1) {
                c43296b.m95128Q(token.m95022b());
            } else {
                if (i11 == 2) {
                    c43296b.m95166r(this);
                    return false;
                }
                if (i11 == 3) {
                    return m95019g(token, c43296b);
                }
                if (i11 == 4) {
                    return m95017e(token, c43296b);
                }
                if (i11 == 5) {
                    Token.C43221c c43221cM95021a = token.m95021a();
                    if (c43221cM95021a.m95036q().equals(HtmlTreeBuilderState.f95390b)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    if (c43296b.m95170t() && HtmlTreeBuilderState.m95011d(c43221cM95021a)) {
                        c43296b.m95167r0();
                        c43296b.m95127P(c43221cM95021a);
                    } else {
                        c43296b.m95167r0();
                        c43296b.m95127P(c43221cM95021a);
                        c43296b.m95168s(false);
                    }
                }
            }
            return true;
        }

        public boolean anyOtherEndTag(Token token, C43296b c43296b) {
            String str = token.m95024d().f95443c;
            ArrayList<Element> arrayListM95114D = c43296b.m95114D();
            for (int size = arrayListM95114D.size() - 1; size >= 0; size--) {
                Element element = arrayListM95114D.get(size);
                if (element.m94853L0().equals(str)) {
                    c43296b.m95174v(str);
                    if (!str.equals(c43296b.m95252a().m94853L0())) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95157m0(str);
                    break;
                }
                if (c43296b.m95143d0(element)) {
                    c43296b.m95166r(this);
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m95018f(Token token, C43296b c43296b) {
            String strM95051D = token.m95024d().m95051D();
            ArrayList<Element> arrayListM95114D = c43296b.m95114D();
            for (int i11 = 0; i11 < 8; i11++) {
                Element elementM95176w = c43296b.m95176w(strM95051D);
                if (elementM95176w == null) {
                    return anyOtherEndTag(token, c43296b);
                }
                if (!c43296b.m95150i0(elementM95176w)) {
                    c43296b.m95166r(this);
                    c43296b.m95169s0(elementM95176w);
                    return true;
                }
                if (!c43296b.m95118G(elementM95176w.m94853L0())) {
                    c43296b.m95166r(this);
                    return false;
                }
                if (c43296b.m95252a() != elementM95176w) {
                    c43296b.m95166r(this);
                }
                int size = arrayListM95114D.size();
                Element element = null;
                boolean z11 = false;
                Element element2 = null;
                for (int i12 = 0; i12 < size && i12 < 64; i12++) {
                    Element element3 = arrayListM95114D.get(i12);
                    if (element3 == elementM95176w) {
                        element2 = arrayListM95114D.get(i12 - 1);
                        z11 = true;
                    } else if (z11 && c43296b.m95143d0(element3)) {
                        element = element3;
                        break;
                    }
                }
                if (element == null) {
                    c43296b.m95157m0(elementM95176w.m94853L0());
                    c43296b.m95169s0(elementM95176w);
                    return true;
                }
                Element elementM95154l = element;
                Element element4 = elementM95154l;
                for (int i13 = 0; i13 < 3; i13++) {
                    if (c43296b.m95150i0(elementM95154l)) {
                        elementM95154l = c43296b.m95154l(elementM95154l);
                    }
                    if (!c43296b.m95140b0(elementM95154l)) {
                        c43296b.m95171t0(elementM95154l);
                    } else {
                        if (elementM95154l == elementM95176w) {
                            break;
                        }
                        Element element5 = new Element(C43300f.m95198o(elementM95154l.mo94801A(), C43298d.f95485d), c43296b.m95178x());
                        c43296b.m95175v0(elementM95154l, element5);
                        c43296b.m95179x0(elementM95154l, element5);
                        if (element4.mo94848H() != null) {
                            element4.m94974L();
                        }
                        element5.m94875f0(element4);
                        elementM95154l = element5;
                        element4 = elementM95154l;
                    }
                }
                if (C43093c.m94685d(element2.m94853L0(), C43218b.f95424t)) {
                    if (element4.mo94848H() != null) {
                        element4.m94974L();
                    }
                    c43296b.m95131T(element4);
                } else {
                    if (element4.mo94848H() != null) {
                        element4.m94974L();
                    }
                    element2.m94875f0(element4);
                }
                Element element6 = new Element(elementM95176w.m94868b1(), c43296b.m95178x());
                element6.mo94878h().m94941e(elementM95176w.mo94878h());
                for (AbstractC43189g abstractC43189g : (AbstractC43189g[]) element.m94994n().toArray(new AbstractC43189g[0])) {
                    element6.m94875f0(abstractC43189g);
                }
                element.m94875f0(element6);
                c43296b.m95169s0(elementM95176w);
                c43296b.m95171t0(elementM95176w);
                c43296b.m95134W(element, element6);
            }
            return true;
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95027g()) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95030j()) {
                c43296b.m95166r(this);
                c43296b.m95153k0();
                c43296b.m95115D0(c43296b.m95152j0());
                return c43296b.mo95147g(token);
            }
            if (token.m95031k()) {
                c43296b.m95153k0();
                c43296b.m95115D0(c43296b.m95152j0());
                return true;
            }
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        public boolean anythingElse(Token token, C43296b c43296b) {
            c43296b.m95166r(this);
            if (C43093c.m94685d(c43296b.m95252a().m94853L0(), C43218b.f95395C)) {
                c43296b.m95109A0(true);
                boolean zM95161o0 = c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
                c43296b.m95109A0(false);
                return zM95161o0;
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95027g()) {
                c43296b.m95149h0();
                c43296b.m95146f0();
                c43296b.m95115D0(HtmlTreeBuilderState.InTableText);
                return c43296b.mo95147g(token);
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return false;
            }
            if (token.m95032l()) {
                Token.C43226h c43226hM95025e = token.m95025e();
                String strM95051D = c43226hM95025e.m95051D();
                if (strM95051D.equals("caption")) {
                    c43296b.m95162p();
                    c43296b.m95132U();
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InCaption);
                } else if (strM95051D.equals("colgroup")) {
                    c43296b.m95162p();
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InColumnGroup);
                } else {
                    if (strM95051D.equals("col")) {
                        c43296b.m95256i("colgroup");
                        return c43296b.mo95147g(token);
                    }
                    if (C43093c.m94685d(strM95051D, C43218b.f95425u)) {
                        c43296b.m95162p();
                        c43296b.m95125N(c43226hM95025e);
                        c43296b.m95115D0(HtmlTreeBuilderState.InTableBody);
                    } else {
                        if (C43093c.m94685d(strM95051D, C43218b.f95426v)) {
                            c43296b.m95256i("tbody");
                            return c43296b.mo95147g(token);
                        }
                        if (strM95051D.equals("table")) {
                            c43296b.m95166r(this);
                            if (c43296b.m95255h("table")) {
                                return c43296b.mo95147g(token);
                            }
                        } else {
                            if (C43093c.m94685d(strM95051D, C43218b.f95427w)) {
                                return c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
                            }
                            if (strM95051D.equals("input")) {
                                if (!c43226hM95025e.f95450j.m94946l("type").equalsIgnoreCase(ViewProps.HIDDEN)) {
                                    return anythingElse(token, c43296b);
                                }
                                c43296b.m95129R(c43226hM95025e);
                            } else if (strM95051D.equals("form")) {
                                c43296b.m95166r(this);
                                if (c43296b.m95182z() != null) {
                                    return false;
                                }
                                c43296b.m95130S(c43226hM95025e, false);
                            } else {
                                return anythingElse(token, c43296b);
                            }
                        }
                    }
                }
                return true;
            }
            if (token.m95031k()) {
                String strM95051D2 = token.m95024d().m95051D();
                if (strM95051D2.equals("table")) {
                    if (!c43296b.m95124M(strM95051D2)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95157m0("table");
                    c43296b.m95181y0();
                    return true;
                }
                if (C43093c.m94685d(strM95051D2, C43218b.f95394B)) {
                    c43296b.m95166r(this);
                    return false;
                }
                return anythingElse(token, c43296b);
            }
            if (token.m95030j()) {
                if (c43296b.m95252a().m94853L0().equals("html")) {
                    c43296b.m95166r(this);
                }
                return true;
            }
            return anythingElse(token, c43296b);
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.f95431a == Token.TokenType.Character) {
                Token.C43221c c43221cM95021a = token.m95021a();
                if (c43221cM95021a.m95036q().equals(HtmlTreeBuilderState.f95390b)) {
                    c43296b.m95166r(this);
                    return false;
                }
                c43296b.m95112C().add(c43221cM95021a.m95036q());
                return true;
            }
            if (c43296b.m95112C().size() > 0) {
                for (String str : c43296b.m95112C()) {
                    if (HtmlTreeBuilderState.m95010c(str)) {
                        c43296b.m95127P(new Token.C43221c().m95035p(str));
                    } else {
                        c43296b.m95166r(this);
                        if (C43093c.m94685d(c43296b.m95252a().m94853L0(), C43218b.f95395C)) {
                            c43296b.m95109A0(true);
                            c43296b.m95161o0(new Token.C43221c().m95035p(str), HtmlTreeBuilderState.InBody);
                            c43296b.m95109A0(false);
                        } else {
                            c43296b.m95161o0(new Token.C43221c().m95035p(str), HtmlTreeBuilderState.InBody);
                        }
                    }
                }
                c43296b.m95149h0();
            }
            c43296b.m95115D0(c43296b.m95152j0());
            return c43296b.mo95147g(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95031k() && token.m95024d().m95051D().equals("caption")) {
                if (!c43296b.m95124M(token.m95024d().m95051D())) {
                    c43296b.m95166r(this);
                    return false;
                }
                c43296b.m95172u();
                if (!c43296b.m95252a().m94853L0().equals("caption")) {
                    c43296b.m95166r(this);
                }
                c43296b.m95157m0("caption");
                c43296b.m95156m();
                c43296b.m95115D0(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.m95032l() && C43093c.m94685d(token.m95025e().m95051D(), C43218b.f95393A)) || (token.m95031k() && token.m95024d().m95051D().equals("table"))) {
                c43296b.m95166r(this);
                if (c43296b.m95255h("caption")) {
                    return c43296b.mo95147g(token);
                }
                return true;
            }
            if (token.m95031k() && C43093c.m94685d(token.m95024d().m95051D(), C43218b.f95404L)) {
                c43296b.m95166r(this);
                return false;
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        /* JADX INFO: renamed from: e */
        public final boolean m95012e(Token token, AbstractC43303i abstractC43303i) {
            if (abstractC43303i.m95255h("colgroup")) {
                return abstractC43303i.mo95147g(token);
            }
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            int i11 = C43217a.f95392a[token.f95431a.ordinal()];
            if (i11 == 1) {
                c43296b.m95128Q(token.m95022b());
            } else if (i11 == 2) {
                c43296b.m95166r(this);
            } else if (i11 == 3) {
                Token.C43226h c43226hM95025e = token.m95025e();
                String strM95051D = c43226hM95025e.m95051D();
                strM95051D.getClass();
                if (!strM95051D.equals("col")) {
                    return !strM95051D.equals("html") ? m95012e(token, c43296b) : c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
                }
                c43296b.m95129R(c43226hM95025e);
            } else {
                if (i11 != 4) {
                    if (i11 != 6) {
                        return m95012e(token, c43296b);
                    }
                    if (c43296b.m95252a().m94853L0().equals("html")) {
                        return true;
                    }
                    return m95012e(token, c43296b);
                }
                if (!token.m95024d().f95443c.equals("colgroup")) {
                    return m95012e(token, c43296b);
                }
                if (c43296b.m95252a().m94853L0().equals("html")) {
                    c43296b.m95166r(this);
                    return false;
                }
                c43296b.m95153k0();
                c43296b.m95115D0(HtmlTreeBuilderState.InTable);
            }
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, C43296b c43296b) {
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InTable);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            int i11 = C43217a.f95392a[token.f95431a.ordinal()];
            if (i11 == 3) {
                Token.C43226h c43226hM95025e = token.m95025e();
                String strM95051D = c43226hM95025e.m95051D();
                if (strM95051D.equals("template")) {
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                }
                if (strM95051D.equals("tr")) {
                    c43296b.m95160o();
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (!C43093c.m94685d(strM95051D, C43218b.f95428x)) {
                    return C43093c.m94685d(strM95051D, C43218b.f95396D) ? m95013e(token, c43296b) : anythingElse(token, c43296b);
                }
                c43296b.m95166r(this);
                c43296b.m95256i("tr");
                return c43296b.mo95147g(c43226hM95025e);
            }
            if (i11 != 4) {
                return anythingElse(token, c43296b);
            }
            String strM95051D2 = token.m95024d().m95051D();
            if (!C43093c.m94685d(strM95051D2, C43218b.f95402J)) {
                if (strM95051D2.equals("table")) {
                    return m95013e(token, c43296b);
                }
                if (!C43093c.m94685d(strM95051D2, C43218b.f95397E)) {
                    return anythingElse(token, c43296b);
                }
                c43296b.m95166r(this);
                return false;
            }
            if (!c43296b.m95124M(strM95051D2)) {
                c43296b.m95166r(this);
                return false;
            }
            c43296b.m95160o();
            c43296b.m95153k0();
            c43296b.m95115D0(HtmlTreeBuilderState.InTable);
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m95013e(Token token, C43296b c43296b) {
            if (!c43296b.m95124M("tbody") && !c43296b.m95124M("thead") && !c43296b.m95118G("tfoot")) {
                c43296b.m95166r(this);
                return false;
            }
            c43296b.m95160o();
            c43296b.m95255h(c43296b.m95252a().m94853L0());
            return c43296b.mo95147g(token);
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, C43296b c43296b) {
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InTable);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m95014e(Token token, AbstractC43303i abstractC43303i) {
            if (abstractC43303i.m95255h("tr")) {
                return abstractC43303i.mo95147g(token);
            }
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95032l()) {
                Token.C43226h c43226hM95025e = token.m95025e();
                String strM95051D = c43226hM95025e.m95051D();
                if (strM95051D.equals("template")) {
                    c43296b.m95125N(c43226hM95025e);
                    return true;
                }
                if (C43093c.m94685d(strM95051D, C43218b.f95428x)) {
                    c43296b.m95164q();
                    c43296b.m95125N(c43226hM95025e);
                    c43296b.m95115D0(HtmlTreeBuilderState.InCell);
                    c43296b.m95132U();
                    return true;
                }
                if (C43093c.m94685d(strM95051D, C43218b.f95398F)) {
                    return m95014e(token, c43296b);
                }
                return anythingElse(token, c43296b);
            }
            if (token.m95031k()) {
                String strM95051D2 = token.m95024d().m95051D();
                if (strM95051D2.equals("tr")) {
                    if (!c43296b.m95124M(strM95051D2)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95164q();
                    c43296b.m95153k0();
                    c43296b.m95115D0(HtmlTreeBuilderState.InTableBody);
                    return true;
                }
                if (strM95051D2.equals("table")) {
                    return m95014e(token, c43296b);
                }
                if (C43093c.m94685d(strM95051D2, C43218b.f95425u)) {
                    if (!c43296b.m95124M(strM95051D2)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95255h("tr");
                    return c43296b.mo95147g(token);
                }
                if (C43093c.m94685d(strM95051D2, C43218b.f95399G)) {
                    c43296b.m95166r(this);
                    return false;
                }
                return anythingElse(token, c43296b);
            }
            return anythingElse(token, c43296b);
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, C43296b c43296b) {
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
        }

        /* JADX INFO: renamed from: e */
        public final void m95015e(C43296b c43296b) {
            if (c43296b.m95124M("td")) {
                c43296b.m95255h("td");
            } else {
                c43296b.m95255h("th");
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95031k()) {
                String strM95051D = token.m95024d().m95051D();
                if (C43093c.m94685d(strM95051D, C43218b.f95428x)) {
                    if (!c43296b.m95124M(strM95051D)) {
                        c43296b.m95166r(this);
                        c43296b.m95115D0(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    c43296b.m95172u();
                    if (!c43296b.m95252a().m94853L0().equals(strM95051D)) {
                        c43296b.m95166r(this);
                    }
                    c43296b.m95157m0(strM95051D);
                    c43296b.m95156m();
                    c43296b.m95115D0(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (C43093c.m94685d(strM95051D, C43218b.f95429y)) {
                    c43296b.m95166r(this);
                    return false;
                }
                if (C43093c.m94685d(strM95051D, C43218b.f95430z)) {
                    if (!c43296b.m95124M(strM95051D)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    m95015e(c43296b);
                    return c43296b.mo95147g(token);
                }
                return anythingElse(token, c43296b);
            }
            if (token.m95032l() && C43093c.m94685d(token.m95025e().m95051D(), C43218b.f95393A)) {
                if (!c43296b.m95124M("td") && !c43296b.m95124M("th")) {
                    c43296b.m95166r(this);
                    return false;
                }
                m95015e(c43296b);
                return c43296b.mo95147g(token);
            }
            return anythingElse(token, c43296b);
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            switch (C43217a.f95392a[token.f95431a.ordinal()]) {
                case 1:
                    c43296b.m95128Q(token.m95022b());
                    return true;
                case 2:
                    c43296b.m95166r(this);
                    return false;
                case 3:
                    Token.C43226h c43226hM95025e = token.m95025e();
                    String strM95051D = c43226hM95025e.m95051D();
                    if (strM95051D.equals("html")) {
                        return c43296b.m95161o0(c43226hM95025e, HtmlTreeBuilderState.InBody);
                    }
                    if (strM95051D.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                        if (c43296b.m95252a().m94853L0().equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                            c43296b.m95255h(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT);
                        }
                        c43296b.m95125N(c43226hM95025e);
                    } else {
                        if (!strM95051D.equals("optgroup")) {
                            if (strM95051D.equals("select")) {
                                c43296b.m95166r(this);
                                return c43296b.m95255h("select");
                            }
                            if (!C43093c.m94685d(strM95051D, C43218b.f95400H)) {
                                return strM95051D.equals("script") ? c43296b.m95161o0(token, HtmlTreeBuilderState.InHead) : anythingElse(token, c43296b);
                            }
                            c43296b.m95166r(this);
                            if (!c43296b.m95121J("select")) {
                                return false;
                            }
                            c43296b.m95255h("select");
                            return c43296b.mo95147g(c43226hM95025e);
                        }
                        if (c43296b.m95252a().m94853L0().equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                            c43296b.m95255h(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT);
                        }
                        if (c43296b.m95252a().m94853L0().equals("optgroup")) {
                            c43296b.m95255h("optgroup");
                        }
                        c43296b.m95125N(c43226hM95025e);
                    }
                    return true;
                case 4:
                    String strM95051D2 = token.m95024d().m95051D();
                    strM95051D2.getClass();
                    switch (strM95051D2) {
                        case "option":
                            if (c43296b.m95252a().m94853L0().equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                                c43296b.m95153k0();
                            } else {
                                c43296b.m95166r(this);
                            }
                            return true;
                        case "select":
                            if (!c43296b.m95121J(strM95051D2)) {
                                c43296b.m95166r(this);
                                return false;
                            }
                            c43296b.m95157m0(strM95051D2);
                            c43296b.m95181y0();
                            return true;
                        case "optgroup":
                            if (c43296b.m95252a().m94853L0().equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT) && c43296b.m95154l(c43296b.m95252a()) != null && c43296b.m95154l(c43296b.m95252a()).m94853L0().equals("optgroup")) {
                                c43296b.m95255h(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT);
                            }
                            if (c43296b.m95252a().m94853L0().equals("optgroup")) {
                                c43296b.m95153k0();
                            } else {
                                c43296b.m95166r(this);
                            }
                            return true;
                        default:
                            return anythingElse(token, c43296b);
                    }
                case 5:
                    Token.C43221c c43221cM95021a = token.m95021a();
                    if (c43221cM95021a.m95036q().equals(HtmlTreeBuilderState.f95390b)) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95127P(c43221cM95021a);
                    return true;
                case 6:
                    if (!c43296b.m95252a().m94853L0().equals("html")) {
                        c43296b.m95166r(this);
                    }
                    return true;
                default:
                    return anythingElse(token, c43296b);
            }
        }

        private boolean anythingElse(Token token, C43296b c43296b) {
            c43296b.m95166r(this);
            return false;
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95032l() && C43093c.m94685d(token.m95025e().m95051D(), C43218b.f95401I)) {
                c43296b.m95166r(this);
                c43296b.m95255h("select");
                return c43296b.mo95147g(token);
            }
            if (token.m95031k() && C43093c.m94685d(token.m95024d().m95051D(), C43218b.f95401I)) {
                c43296b.m95166r(this);
                if (c43296b.m95124M(token.m95024d().m95051D())) {
                    c43296b.m95255h("select");
                    return c43296b.mo95147g(token);
                }
                return false;
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InSelect);
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return false;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("html")) {
                return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.m95031k() && token.m95024d().m95051D().equals("html")) {
                if (c43296b.m95138a0()) {
                    c43296b.m95166r(this);
                    return false;
                }
                c43296b.m95115D0(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.m95030j()) {
                return true;
            }
            c43296b.m95166r(this);
            c43296b.m95115D0(HtmlTreeBuilderState.InBody);
            return c43296b.mo95147g(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
            } else if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
            } else {
                if (token.m95029i()) {
                    c43296b.m95166r(this);
                    return false;
                }
                if (token.m95032l()) {
                    Token.C43226h c43226hM95025e = token.m95025e();
                    String strM95051D = c43226hM95025e.m95051D();
                    strM95051D.getClass();
                    switch (strM95051D) {
                        case "frameset":
                            c43296b.m95125N(c43226hM95025e);
                            break;
                        case "html":
                            return c43296b.m95161o0(c43226hM95025e, HtmlTreeBuilderState.InBody);
                        case "frame":
                            c43296b.m95129R(c43226hM95025e);
                            break;
                        case "noframes":
                            return c43296b.m95161o0(c43226hM95025e, HtmlTreeBuilderState.InHead);
                        default:
                            c43296b.m95166r(this);
                            return false;
                    }
                } else if (token.m95031k() && token.m95024d().m95051D().equals("frameset")) {
                    if (c43296b.m95252a().m94853L0().equals("html")) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    c43296b.m95153k0();
                    if (!c43296b.m95138a0() && !c43296b.m95252a().m94853L0().equals("frameset")) {
                        c43296b.m95115D0(HtmlTreeBuilderState.AfterFrameset);
                    }
                } else {
                    if (!token.m95030j()) {
                        c43296b.m95166r(this);
                        return false;
                    }
                    if (!c43296b.m95252a().m94853L0().equals("html")) {
                        c43296b.m95166r(this);
                    }
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (HtmlTreeBuilderState.m95011d(token)) {
                c43296b.m95127P(token.m95021a());
                return true;
            }
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (token.m95029i()) {
                c43296b.m95166r(this);
                return false;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("html")) {
                return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.m95031k() && token.m95024d().m95051D().equals("html")) {
                c43296b.m95115D0(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.m95032l() && token.m95025e().m95051D().equals("noframes")) {
                return c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
            }
            if (token.m95030j()) {
                return true;
            }
            c43296b.m95166r(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (!token.m95029i() && (!token.m95032l() || !token.m95025e().m95051D().equals("html"))) {
                if (HtmlTreeBuilderState.m95011d(token)) {
                    Element elementM95157m0 = c43296b.m95157m0("html");
                    c43296b.m95127P(token.m95021a());
                    c43296b.f95533e.add(elementM95157m0);
                    c43296b.f95533e.add(elementM95157m0.m94866Z0(TtmlNode.TAG_BODY));
                    return true;
                }
                if (token.m95030j()) {
                    return true;
                }
                c43296b.m95166r(this);
                c43296b.m95115D0(HtmlTreeBuilderState.InBody);
                return c43296b.mo95147g(token);
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            if (token.m95028h()) {
                c43296b.m95128Q(token.m95022b());
                return true;
            }
            if (!token.m95029i() && !HtmlTreeBuilderState.m95011d(token) && (!token.m95032l() || !token.m95025e().m95051D().equals("html"))) {
                if (token.m95030j()) {
                    return true;
                }
                if (token.m95032l() && token.m95025e().m95051D().equals("noframes")) {
                    return c43296b.m95161o0(token, HtmlTreeBuilderState.InHead);
                }
                c43296b.m95166r(this);
                return false;
            }
            return c43296b.m95161o0(token, HtmlTreeBuilderState.InBody);
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, C43296b c43296b) {
            return true;
        }
    };


    /* JADX INFO: renamed from: b */
    public static final String f95390b = String.valueOf((char) 0);

    /* JADX INFO: renamed from: org.jsoup.parser.HtmlTreeBuilderState$b */
    public static final class C43218b {

        /* JADX INFO: renamed from: a */
        public static final String[] f95405a = {TtmlNode.RUBY_BASE, "basefont", "bgsound", "command", SignTermItem.LINK};

        /* JADX INFO: renamed from: b */
        public static final String[] f95406b = {"noframes", TtmlNode.TAG_STYLE};

        /* JADX INFO: renamed from: c */
        public static final String[] f95407c = {TtmlNode.TAG_BODY, "br", "html"};

        /* JADX INFO: renamed from: d */
        public static final String[] f95408d = {TtmlNode.TAG_BODY, "html"};

        /* JADX INFO: renamed from: e */
        public static final String[] f95409e = {TtmlNode.TAG_BODY, "br", TtmlNode.TAG_HEAD, "html"};

        /* JADX INFO: renamed from: f */
        public static final String[] f95410f = {"basefont", "bgsound", SignTermItem.LINK, "meta", "noframes", TtmlNode.TAG_STYLE};

        /* JADX INFO: renamed from: g */
        public static final String[] f95411g = {TtmlNode.RUBY_BASE, "basefont", "bgsound", "command", SignTermItem.LINK, "meta", "noframes", "script", TtmlNode.TAG_STYLE, "title"};

        /* JADX INFO: renamed from: h */
        public static final String[] f95412h = {"address", "article", "aside", "blockquote", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, CmcdConfiguration.KEY_DEADLINE, "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* JADX INFO: renamed from: i */
        public static final String[] f95413i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* JADX INFO: renamed from: j */
        public static final String[] f95414j = {"address", TtmlNode.TAG_DIV, "p"};

        /* JADX INFO: renamed from: k */
        public static final String[] f95415k = {"dd", "dt"};

        /* JADX INFO: renamed from: l */
        public static final String[] f95416l = {"b", "big", "code", "em", "font", "i", CmcdData.Factory.STREAMING_FORMAT_SS, "small", "strike", "strong", TtmlNode.TAG_TT, "u"};

        /* JADX INFO: renamed from: m */
        public static final String[] f95417m = {"applet", "marquee", "object"};

        /* JADX INFO: renamed from: n */
        public static final String[] f95418n = {"area", "br", "embed", "img", "keygen", "wbr"};

        /* JADX INFO: renamed from: o */
        public static final String[] f95419o = {"param", "source", "track"};

        /* JADX INFO: renamed from: p */
        public static final String[] f95420p = {TUIConstants.TIMPush.NOTIFICATION.ACTION, "name", "prompt"};

        /* JADX INFO: renamed from: q */
        public static final String[] f95421q = {"caption", "col", "colgroup", TypedValues.AttributesType.S_FRAME, TtmlNode.TAG_HEAD, "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: r */
        public static final String[] f95422r = {"address", "article", "aside", "blockquote", "button", TtmlNode.CENTER, "details", "dir", TtmlNode.TAG_DIV, CmcdConfiguration.KEY_DEADLINE, "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* JADX INFO: renamed from: s */
        public static final String[] f95423s = {CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "big", "code", "em", "font", "i", "nobr", CmcdData.Factory.STREAMING_FORMAT_SS, "small", "strike", "strong", TtmlNode.TAG_TT, "u"};

        /* JADX INFO: renamed from: t */
        public static final String[] f95424t = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: u */
        public static final String[] f95425u = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: v */
        public static final String[] f95426v = {"td", "th", "tr"};

        /* JADX INFO: renamed from: w */
        public static final String[] f95427w = {"script", TtmlNode.TAG_STYLE};

        /* JADX INFO: renamed from: x */
        public static final String[] f95428x = {"td", "th"};

        /* JADX INFO: renamed from: y */
        public static final String[] f95429y = {TtmlNode.TAG_BODY, "caption", "col", "colgroup", "html"};

        /* JADX INFO: renamed from: z */
        public static final String[] f95430z = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: A */
        public static final String[] f95393A = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: B */
        public static final String[] f95394B = {TtmlNode.TAG_BODY, "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: C */
        public static final String[] f95395C = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: D */
        public static final String[] f95396D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: E */
        public static final String[] f95397E = {TtmlNode.TAG_BODY, "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* JADX INFO: renamed from: F */
        public static final String[] f95398F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: G */
        public static final String[] f95399G = {TtmlNode.TAG_BODY, "caption", "col", "colgroup", "html", "td", "th"};

        /* JADX INFO: renamed from: H */
        public static final String[] f95400H = {"input", "keygen", "textarea"};

        /* JADX INFO: renamed from: I */
        public static final String[] f95401I = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: J */
        public static final String[] f95402J = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: K */
        public static final String[] f95403K = {TtmlNode.TAG_HEAD, "noscript"};

        /* JADX INFO: renamed from: L */
        public static final String[] f95404L = {TtmlNode.TAG_BODY, "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    public abstract boolean process(Token token, C43296b c43296b);

    /* JADX INFO: renamed from: org.jsoup.parser.HtmlTreeBuilderState$a */
    public static /* synthetic */ class C43217a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95392a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f95392a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95392a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95392a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95392a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95392a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95392a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m95008a(Token.C43226h c43226h, C43296b c43296b) {
        c43296b.f95531c.m95251v(TokeniserState.Rawtext);
        c43296b.m95146f0();
        c43296b.m95115D0(Text);
        c43296b.m95125N(c43226h);
    }

    /* JADX INFO: renamed from: b */
    public static void m95009b(Token.C43226h c43226h, C43296b c43296b) {
        c43296b.f95531c.m95251v(TokeniserState.Rcdata);
        c43296b.m95146f0();
        c43296b.m95115D0(Text);
        c43296b.m95125N(c43226h);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m95010c(String str) {
        return C43093c.m94687f(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m95011d(Token token) {
        if (token.m95027g()) {
            return C43093c.m94687f(token.m95021a().m95036q());
        }
        return false;
    }
}
