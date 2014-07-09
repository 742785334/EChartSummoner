/**
 * 
 */
package cn.nh121.echarts.core;

import java.util.ArrayList;

import cn.nh121.echarts.timeline.Timeline;
import cn.nh121.echarts.toolbox.Toolbox;

/**
 * @author ODMark
 * @creation 2014-7-7
 */
public class RootOption
{
    private EColor            backgroundColor;
    private ArrayList<EColor> colorList;
    private Boolean           renderAsImage;
    private Boolean           calculable;
    private Boolean           animation;
    private Timeline          timeline;
    private Title             title;
    private Toolbox           toolbox;
    private Tooltip           tooltip;
    private Legend            legend;
    private DataRange         dataRange;
    private DataZoom          dataZoom;
    private Grid              grid;
    private XAxes             xAxes;
    private YAxes             yAxes;

}
