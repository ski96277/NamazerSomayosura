package com.example.namazersomayosura;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.namazersomayosura.databinding.AboutUsFBindingImpl;
import com.example.namazersomayosura.databinding.AboutUsFBindingXhdpiImpl;
import com.example.namazersomayosura.databinding.Allahr99NameBindingImpl;
import com.example.namazersomayosura.databinding.ContentMainBindingImpl;
import com.example.namazersomayosura.databinding.HadithDetailsFBindingImpl;
import com.example.namazersomayosura.databinding.HomeFragmentBindingImpl;
import com.example.namazersomayosura.databinding.ItemViewAllahrNameBindingImpl;
import com.example.namazersomayosura.databinding.KalimaShowBindingImpl;
import com.example.namazersomayosura.databinding.KalimaSomuhoListFBindingImpl;
import com.example.namazersomayosura.databinding.NamazerGuruttoHadisBindingImpl;
import com.example.namazersomayosura.databinding.NamazerSuraFBindingImpl;
import com.example.namazersomayosura.databinding.QuranwebViewFBindingImpl;
import com.example.namazersomayosura.databinding.RozarSomay2019BindingImpl;
import com.example.namazersomayosura.databinding.SuraDetailsFBindingImpl;
import com.example.namazersomayosura.databinding.TasbihFBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ABOUTUSF = 1;

  private static final int LAYOUT_ALLAHR99NAME = 2;

  private static final int LAYOUT_CONTENTMAIN = 3;

  private static final int LAYOUT_HADITHDETAILSF = 4;

  private static final int LAYOUT_HOMEFRAGMENT = 5;

  private static final int LAYOUT_ITEMVIEWALLAHRNAME = 6;

  private static final int LAYOUT_KALIMASHOW = 7;

  private static final int LAYOUT_KALIMASOMUHOLISTF = 8;

  private static final int LAYOUT_NAMAZERGURUTTOHADIS = 9;

  private static final int LAYOUT_NAMAZERSURAF = 10;

  private static final int LAYOUT_QURANWEBVIEWF = 11;

  private static final int LAYOUT_ROZARSOMAY2019 = 12;

  private static final int LAYOUT_SURADETAILSF = 13;

  private static final int LAYOUT_TASBIHF = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.about_us_f, LAYOUT_ABOUTUSF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.allahr_99_name, LAYOUT_ALLAHR99NAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.hadith_details_f, LAYOUT_HADITHDETAILSF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.item_view_allahr_name, LAYOUT_ITEMVIEWALLAHRNAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.kalima_show, LAYOUT_KALIMASHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.kalima_somuho_list_f, LAYOUT_KALIMASOMUHOLISTF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.namazer_gurutto_hadis, LAYOUT_NAMAZERGURUTTOHADIS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.namazer_sura_f, LAYOUT_NAMAZERSURAF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.quranweb_view_f, LAYOUT_QURANWEBVIEWF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.rozar_somay_2019, LAYOUT_ROZARSOMAY2019);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.sura_details_f, LAYOUT_SURADETAILSF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.namazersomayosura.R.layout.tasbih_f, LAYOUT_TASBIHF);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ABOUTUSF: {
          if ("layout/about_us_f_0".equals(tag)) {
            return new AboutUsFBindingImpl(component, view);
          }
          if ("layout-xhdpi/about_us_f_0".equals(tag)) {
            return new AboutUsFBindingXhdpiImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for about_us_f is invalid. Received: " + tag);
        }
        case  LAYOUT_ALLAHR99NAME: {
          if ("layout/allahr_99_name_0".equals(tag)) {
            return new Allahr99NameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for allahr_99_name is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMAIN: {
          if ("layout/content_main_0".equals(tag)) {
            return new ContentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
        }
        case  LAYOUT_HADITHDETAILSF: {
          if ("layout/hadith_details_f_0".equals(tag)) {
            return new HadithDetailsFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hadith_details_f is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIEWALLAHRNAME: {
          if ("layout/item_view_allahr_name_0".equals(tag)) {
            return new ItemViewAllahrNameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_view_allahr_name is invalid. Received: " + tag);
        }
        case  LAYOUT_KALIMASHOW: {
          if ("layout/kalima_show_0".equals(tag)) {
            return new KalimaShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for kalima_show is invalid. Received: " + tag);
        }
        case  LAYOUT_KALIMASOMUHOLISTF: {
          if ("layout/kalima_somuho_list_f_0".equals(tag)) {
            return new KalimaSomuhoListFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for kalima_somuho_list_f is invalid. Received: " + tag);
        }
        case  LAYOUT_NAMAZERGURUTTOHADIS: {
          if ("layout/namazer_gurutto_hadis_0".equals(tag)) {
            return new NamazerGuruttoHadisBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for namazer_gurutto_hadis is invalid. Received: " + tag);
        }
        case  LAYOUT_NAMAZERSURAF: {
          if ("layout/namazer_sura_f_0".equals(tag)) {
            return new NamazerSuraFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for namazer_sura_f is invalid. Received: " + tag);
        }
        case  LAYOUT_QURANWEBVIEWF: {
          if ("layout/quranweb_view_f_0".equals(tag)) {
            return new QuranwebViewFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for quranweb_view_f is invalid. Received: " + tag);
        }
        case  LAYOUT_ROZARSOMAY2019: {
          if ("layout/rozar_somay_2019_0".equals(tag)) {
            return new RozarSomay2019BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rozar_somay_2019 is invalid. Received: " + tag);
        }
        case  LAYOUT_SURADETAILSF: {
          if ("layout/sura_details_f_0".equals(tag)) {
            return new SuraDetailsFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sura_details_f is invalid. Received: " + tag);
        }
        case  LAYOUT_TASBIHF: {
          if ("layout/tasbih_f_0".equals(tag)) {
            return new TasbihFBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tasbih_f is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/about_us_f_0", com.example.namazersomayosura.R.layout.about_us_f);
      sKeys.put("layout-xhdpi/about_us_f_0", com.example.namazersomayosura.R.layout.about_us_f);
      sKeys.put("layout/allahr_99_name_0", com.example.namazersomayosura.R.layout.allahr_99_name);
      sKeys.put("layout/content_main_0", com.example.namazersomayosura.R.layout.content_main);
      sKeys.put("layout/hadith_details_f_0", com.example.namazersomayosura.R.layout.hadith_details_f);
      sKeys.put("layout/home_fragment_0", com.example.namazersomayosura.R.layout.home_fragment);
      sKeys.put("layout/item_view_allahr_name_0", com.example.namazersomayosura.R.layout.item_view_allahr_name);
      sKeys.put("layout/kalima_show_0", com.example.namazersomayosura.R.layout.kalima_show);
      sKeys.put("layout/kalima_somuho_list_f_0", com.example.namazersomayosura.R.layout.kalima_somuho_list_f);
      sKeys.put("layout/namazer_gurutto_hadis_0", com.example.namazersomayosura.R.layout.namazer_gurutto_hadis);
      sKeys.put("layout/namazer_sura_f_0", com.example.namazersomayosura.R.layout.namazer_sura_f);
      sKeys.put("layout/quranweb_view_f_0", com.example.namazersomayosura.R.layout.quranweb_view_f);
      sKeys.put("layout/rozar_somay_2019_0", com.example.namazersomayosura.R.layout.rozar_somay_2019);
      sKeys.put("layout/sura_details_f_0", com.example.namazersomayosura.R.layout.sura_details_f);
      sKeys.put("layout/tasbih_f_0", com.example.namazersomayosura.R.layout.tasbih_f);
    }
  }
}
