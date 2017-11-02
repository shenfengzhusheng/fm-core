package org.xfs.core.util;

import java.io.File;


/**
 * 接口常量
 * 
 * @author Tiny
 * @date 2016-07-16
 */

public class InterfacesConstant {


    /**
     * 上游
     */
    public static final String UPPER = "10";

    /**
     * 下游
     */
    public static final String DOWN = "20";

    /**
     * 成功标识
     */
    public static final String SUCCESS = "Success";

    /**
     * 失败标识
     */
    public static final String ERROR = "Error";

    /**
     * 连接失败标识
     */
    public static final String FAIL = "Fail";


    /**
     * 编码格式
     */
    public static final String UTF_8 = "UTF-8";

    public static final String CHARSET_ISO88591 = "ISO8859-1";

    /**
     * 编码格式
     */
    public static final String UTF_8_LETTER = "utf-8";

    /**
     * 内容格式
     */
    public static final String APPLICATION_JSON = "application/json";


    /**
     * 内容格式
     */
    public static final String APPLICATION_WWW_URLENCODED = "application/x-www-form-urlencoded";


    /**
     * 货源发布接口
     */
    public static final String GOODS_PUBLICSH = "GoodsPublish";

    /**
     * 竞价反馈接口
     */
    public static final String AUCIONT_FEED_BACK = "AuctionFeedback";

    /**
     * 货源订单接入接口
     */
    public static final String GOODS_ORDER = "GoodsOrder";

    /**
     * 运单信息反馈接口
     */
    public static final String UNS_ORDER_WAY_BILL_FB = "UnsOrderWayBillFb";

    /**
     * 订单状态反馈接口
     */
    public static final String ORDER_STATUS_FB = "OrderStatusFb";

    /**
     * 运单路由信息反馈接口
     */
    public static final String WAY_BILL_FEED_BACK = "WaybillFeedback";

    /**
     * 业务处理反馈接口
     */
    public static final String BUSSINESS_EXP_FB_SEND = "BussinessExpFbSend";

    /**
     * 业务处理接收接口
     */
    public static final String BUSSINESS_EXP_FB_RECV = "BussinessExpFbRecv";

    /**
     * 56N运单下发接口
     */
    public static final String PLAT_WAY_BILL_ORDER = "PlatWayBillOrder";
    /**
     * 56N运单取消接口
     */
    public static final String CANCEL_PLAT_WAY_BILL_ORDER = "CancelPlatWayBillOrder";
    /**
     * /** 调度单下发接口
     */
    public static final String DISPATCH_WAY_BILL = "DispatchWayBill";

    /**
     * 润阳下单反馈接口
     */
    public static final String ORDER_FEEDBACK = "OrderFeedback";


    /**
     * 吉林取消反馈接口
     */
    public static final String JILIN_ORDER_CANCEL_FEEDBACK = "OrderCancelFeedbackJL ";

    /**
     * 润阳取消反馈接口
     */
    public static final String ORDER_FEEDBACK_JILIN = "OrderCancelFeedbackJL";

    /**
     * 康程运单取消接口
     */
    public static final String PLAT_CANCEL_WAY_BILL = "PlatCancelWayBill";

    /**
     * 运单调度信息反馈接口
     */
    public static final String PLAT_DISPATCH_WAY_BILL_FB = "PlatDispatchWayBillFb";

    /**
     * 运单装车信息反馈接口
     */
    public static final String PLAT_CAR_LOADING_INFO_FB = "PlatCarLoadingInfoFb";

    /**
     * 国药温湿度接口接口
     */
    public static final String GY_HN = "GYHN";

    /**
     * 国药温湿度接口接口代码
     */
    public static final String RECE_TEMP_INFO = "RecvTemperatureInfo";

    /**
     * 运单路由信息接口
     */
    public static final String PLAT_ROUTE_INFO = "PlatRouteInfo";

    /**
     * 运单签收信息接口
     */
    public static final String PLAT_SIGN_INFO = "PlatSignInfo";

    /**
     * 运单回单上传信息接口
     */
    public static final String PLAT_BACKIMG = "PlatBackimg";

    /**
     * 56N运单接收接口
     */
    public static final String ORDER_DISPATCH = "OrderDispatch";


    /**
     * 国药查询接口
     */
    public static final String WAYBILL_QUERY = "WaybillQuery";

    /**
     * 国药湖南运单查询接口
     */
    public static final String WAYBILL_SYNCH = "WaybillSynch";

    /**
     * 商品SKU下发接口
     */
    public static final String SKU_INFO = "SkuInfo";

    /**
     * 出库计划接口
     */
    public static final String WMS_SO = "WmsSo";

    /**
     * 费用同步接口
     */
    public static final String FEE_SYNCH = "FeeSynch";

    /**
     * 吉林计费同步接口
     */
    public static final String WAYBILLFEE_SYNCH = "WayBillFeeSynch";

    /**
     * 商品库存同步接收接口
     */
    public static final String INVENTORY_SYNCH = "InventorySynch";
    /**
     * 入库同步接口
     */
    public static final String ASN_SYNCH = "AsnSynch";
    /**
     * 检验检疫报告接口
     */
    public static final String INSPECTION_QUARANTINE = "InspectionQuarantine";
    /**
     * 收货明细同步接口
     */
    public static final String RECEIPT_DETAIL = "ReceiptDetail";
    /**
     * 附件同步接口
     */
    public static final String FILE_SYNCH = "FileSynch";

    /**
     * 温度GPS接口
     */
    public static final String VEHICLE_GPS_TEMP_INFO = "VehicleGpsTempInfo";

    /**
     * 查询温湿度
     */
    public static final String QUERY_TEMPERATURE = "QueryTemperature";

    /**
     * 获取途宝设备
     */
    public static final String GET_CLIENT_DEVICES = "GetClientDevices";
    /**
     * WMS运单下发接口
     */
    public static final String WAY_BILL_SENT_OUT = "WayBillSentOut";
    /**
     * WMS出库记录接口
     */
    public static final String STOCK_OUT_FEEDBACK = "StockOutFeedback";
    /**
     * 56N订单下发接口(定时器)
     */
    public static final String ORDER_TO_CARRIER = "OrderToCarrier";
    /**
     * 56N订单下发接口(实时)
     */
    public static final String ORDER_TO_CARRIER_ON_TIME = "OrderToCarrierOnTime";
    /**
     * 56N订单修改接口
     */
    public static final String ORDER_UPDATE_CARRIER = "OrderUpdateCarrier";
    /**
     * 56N订单取消接口
     */
    public static final String ORDER_CANCEL_CARRIER = "OrderCancelCarrier";
    /**
     * 56N运单签收接口
     */
    public static final String LOGISTICS_WAYBILL_SIGN = "LogisticsWaybillSign";
    /**
     * 56NGPS定位数据发送接口
     */
    public static final String GPS_INFORNATION = "GpsInfornation";
    /**
     * 56N手机定位数据接收接口
     */
    public static final String MOBILE_INFORNATION = "MobileInfornation";
    /**
     * 56N温湿度数据发送接口
     */
    public static final String TEMPERATURE_INFORNATION = "TemperatureInfornation";
    /**
     * 56N承运商同步接口
     */
    public static final String OFFICE_SYNCH = "OfficeSynch";
    /**
     * 56N运单路由接口
     */
    public static final String PLAT_ROUTE = "PlatRoute";
    /**
     * 56N收货确认接口
     */
    public static final String RECEIPT_CONFIRMATION = "ReceiptConfirmation";
    /**
     * 56N评价接口
     */
    public static final String EVALUATE = "Evaluate";
    /**
     * 56N投诉接口
     */
    public static final String COMPLAINT = "Complaint";
    /**
     * 56N用车确认接口
     */
    public static final String LOGISTICS_LOADINGCAR = "LogisticsLoadingCar";
    /**
     * 56N交车确认接口
     */
    public static final String LOGISTICS_RETURNCAR = "LogisticsReturnCar";
    /**
     * 56N在途异常接口
     */
    public static final String LOGISTICS_ABNORMALTRANSIT = "LogisticsAbnormalTransit";

    /**
     * 56N在途异常确认反馈接口
     */
    public static final String LOGISTICS_ABNORMALTRANSIT_FEEDBACK = "LogisticsAbnormalTransitFeedback";

    /**
     * 56N线路同步接口
     */
    public static final String LOGISTICS_LINESYNCHRONIZATION = "LogisticsLineSynchronization";

    /**
     * 吉林司机信息同步接口
     */
    public static final String DRIVER_SYNCHRONIZATION = "driverSynchronization";

    /**
     * 车辆信息同步接口
     */
    public static final String CAR_SYNCHRONIZATION = "carSynchronization";

    /**
     * 吉林司机车辆信息同步接口
     */
    public static final String DRIVER_AND_CAR_SYNCHRONIZATION = "driverAndCarSynchronization";

    /**
     * 吉林司机车辆信息同步接口
     */
    public static final String TEMPERATURE_SYNCHRONIZATION = "temperatureSynchronization";
    /**
     * 润阳订单接收接口
     */
    public static final String ORDER_RECV = "OrderRecv";
    /**
     * 吉林订单接收接口
     */
    public static final String ORDER_RECV_JL = "OrderReceiveJL";
    /**
     * 润阳路由反馈接口
     */
    public static final String FEED_BACK_INFO_RECV = "FeedBackInfoRecv";
    /**
     * 润阳订单取消接口
     */
    public static final String RY_ORDER_CANCEL = "RyOrderCancel";
    /**
     * 吉林订单取消接口
     */
    public static final String JL_ORDER_CANCEL = "OrderCancelJL";

    /**
     * 吉林装车反馈接口
     */
    public static final String JL_CAR_LOADING = "CarLoadingJL";
    /**
     * 吉林路由信息反馈接口
     */
    public static final String JL_ROUTE = "RouteJL";
    /**
     * 吉林签收反馈接口
     */
    public static final String JL_SIGN = "SignJL";
    /**
     * 吉林异常签收接口
     */
    public static final String JL_SIGN_EXCEPTION = "SignExceptionJL";
    /**
     * 吉林回单上传接口
     */
    public static final String JL_RECEIPT = "ReceiptJL";

    /**
     * 吉林在途异常反馈接口
     */
    public static final String JL_ABNORMALTRANSIT = "AbnormalTransitJL";

    /**
     * 吉林交车反馈接口
     */
    public static final String JL_RETURNCAR = "ReturnCarJL";

    /**
     * 吉林用车反馈接口
     */
    public static final String JL_LOADINGCAR = "LoadingCarJL";

    /**
     * 吉林路线接收接口
     */
    public static final String JL_LINESYNCHRONIZATION = "LineSynchronizationJL";

    /**
     * 吉林货物与冷藏箱关系接收接口
     */
    public static final String GOODS_AND_FREEZERS_JL = "GoodsAndFreezersJL";
    /**
     * 吉林货物与冷藏箱关系调56N接口
     */
    public static final String GOODS_AND_FREEZERS_JL_56N = "GoodsAndFreezersJL56N ";


    /**
     * 吉林订单取消反馈接口
     */
    public static final String JL_ORDER_CANCEL_FEEDBACK = "OrderCancelFeedbackJL";
    /**
     * 润阳订单取消反馈接口
     */
    public static final String RY_ORDER_CANCEL_FEEDBACK = "RyOrderCancelFeedback";
    /**
     * 国药调度单取消接口
     */
    public static final String GY_ORDER_CANCEL = "GyOrderCancel";
    /**
     * 国药订单取消反馈接口
     */
    public static final String GY_ORDER_CANCEL_FEEDBACK = "GyOrderCancelFeedback";
    /**
     * 温度GPS接口厂商编码（JLT）
     */
    public static final String INTERFACE_CODE = "JLT";
    /**
     * 定位方式（GPS温湿度接口）
     */
    public static final String LOCATION_MODE = "GPS";
    /**
     * 东经标记（GPS温湿度接口）
     */
    public static final String LON_EAST_MARK = "0";
    /**
     * 西经标记（GPS温湿度接口）
     */
    public static final String LON_WEST_MARK = "1";
    /**
     * 北纬标记（GPS温湿度接口）
     */
    public static final String LAT_NOR_MARK = "0";
    /**
     * 南纬标记（GPS温湿度接口）
     */
    public static final String LON_SOU_MARK = "1";
    /**
     * 探头类型温度（GPS温湿度接口）
     */
    public static final String PROBE_TYPE_TEMPERATURE = "1";
    /**
     * 探头类型湿度（GPS温湿度接口）
     */
    public static final String PROBE_TYPE_DAMPNESS = "2";

    /**
     * EDI_OFFICE中宁图位置信息接口编码
     */
    public static final String LINKTO_POSITION = "LinkToPosition";

    /**
     * 宁图配置常量“NT”
     */
    public static final String NT = "NT";
    /**
     * 宁图/捷依探头编号1
     */
    public static final String PROBE_NUM_ONE = "1";
    /**
     * 宁图/捷依探头编号2
     */
    public static final String PROBE_NUM_TWO = "2";
    /**
     * 宁图/捷依探头编号3
     */
    public static final String PROBE_NUM_THREE = "3";
    /**
     * 宁图/捷依探头编号4
     */
    public static final String PROBE_NUM_FOUR = "4";

    /**
     * GPS_CONFIG中宁图获取位置信息接口类型
     */
    public static final String NT_INTERFACE_TYPE = "GetPosition";

    /**
     * EDI_OFFICE中捷依GPS接口编码
     */
    public static final String JIEYI_POSITION = "JieYiPosition";

    /**
     * EDI_OFFICE中GPS接口编码
     */
    public static final String ZUOTOUJING_POSITION = "ZuoTouJingPosition";

    /**
     * EDI_OFFICE中百度鹰眼接口编码
     */
    public static final String LYBYUN = "lybyun";
    /**
     * EDI_OFFICE中百度鹰眼经纬度编码
     */
    public static final String BAIDU_3 = "3";

    /**
     * EDI_OFFICE中百度鹰眼历史数据接口编码
     */
    public static final String LYBYUN_HISTORY = "lybyunHistory";


    /**
     * EDI_OFFICE中百度鹰眼mobile接口编码
     */
    public static final String LYBYUN_MOBILE = "lybyunMobile";

    /**
     * 中集冷云设备类型
     */
    public static final String ZJLY = "ZJLY";
    /**
     * 中集冷云接口
     */
    public static final String ZJLY_POSITION = "ZjlyPosition";
    /**
     * 调度单接收接口
     */
    public static final String DISPATCH_RECEIVE = "dispatchReceive";

    /**
     * 百度鹰眼常量
     */
    public static final String IS_PROCESSED_C = "1";
    public static final String PROCESS_OPTION_C = "need_mapmatch=1";
    public static final String SUPPLEMENT_MODE_C = "driving";
    public static final String SORT_TYPE_C = "1";

    public static final String AK = "ak";
    public static final String SERVICE_ID = "service_id";
    public static final String START_TIME = "start_time";
    public static final String END_TIME = "end_time";
    public static final String ENTITY_NAME = "entity_name";
    public static final String SORT_TYPE = "sort_type";
    public static final String IS_PROCESSED = "is_processed";
    public static final String PROCESS_OPTION = "process_option";
    public static final String SUPPLEMENT_MODE = "supplement_mode";
    public static final String PAGE_INDEX = "page_index";
    public static final String PAGE_SIZE = "page_size";
    public static final String SIZE_SET = "5000";


    /**
     * 捷依配置常量“JY”
     */
    public static final String JY = "JY";

    /**
     * 座头鲸配置常量“ZTJ”
     */
    public static final String ZTJ = "ZTJ";

    /**
     * 捷依是都显示位置标识，暂时固定传“1”
     */
    public static final String HAS_LOCATION = "1";

    /**
     * cookie名称
     */
    public static final String LOGIN_FLAG = "sino.topin.login.flag";

    /**
     * sessionkey
     */
    public static final String SESSIONKEY = "loggedin.user.session.id";

    /**
     * cookie
     */
    public static final String COOKIE_USER_ID = "userKey";
    public static final String COOKIE_OFFICE_ID = "comKey";
    public static final String COOKIE_CHECK_STATUS = "checkStatus";

    /*************************** 系统固定参数类型 *********************************/
    /**
     * 邮件
     */
    public static final String SYS_EMAIL = "Mail";
    /**
     * 签到积分
     */
    public static final String SYS_SIGN_IN = "SignIn";
    /**
     * 订单积分设定
     */
    public static final String SYS_ORDER_INTEGRAL = "orderIntegral";

    /**
     * 基础数据
     */
    public static final String CACHE_CODE_MASTER = "CodeMaster.";
    /**
     * 通用的
     */
    public static final String YES = "Y";// 是，启用
    public static final String NO = "N";// 否，禁用

    /**
     * 图片上传路径的文件名 （作废）
     */
    public static final String SEPARATOR = File.separator;// 系统分隔符
    public static final String IMAGE = "image";// 图片上传文件夹
    public static final String TEMP = "temp";// 临时文件夹
    public static final String HEADPOR = "headpor";// 用户头像
    public static final String WAREHOUSE_IMG = "warehouse";// 仓库文件夹
    public static final String PHOTO_IMG = "photo";// 仓库图片
    public static final String WAREHOUSE_ZZ_IMG = "Qualification";// 仓库资质
    public static final String ORDER_IMG = "order";// 订单
    public static final String PICKUP_IMG = "pickup";// 订单提货
    public static final String SIGN_IMG = "sign";// 订单签收

    /************************************** 基础数据 *****************************************************/

    public static final String S_PRICE_UNIT = "S_PRICE_UNIT";// 价格单位
    public static final String CARTYPENO = "CarTypeNo"; // 车辆温别
    public static final String OPENINVOICE = "Invoice"; // 是否开发票
    public static final String FEEPAYWAY = "YfzfType"; // 运费支付方式
    public static final String TRANSPORTWAY = "ShippingWay"; // 运输方式
    public static final String TEMPERATURE = "Highwd"; // 温度
    public static final String BANK = "CobankAccount"; // 银行
    public static final String TYPEOFGOODS = "TYPEOFGOODS";// 货物
    public static final String TRANSPORTATION = "TRANSPORTATION";// 运输
    public static final String DOSAGEFORM = "DOSAGEFORM";// 剂型
    public static final String QUNITNAME = "QUNITNAME";// 数量单位
    /**
     * 车型
     */
    public static final String VEHICLE_TYPE = "VEHICLE_TYPE";
    /**
     * 车长
     */
    public static final String VEHICLE_LENGTH = "VEHICLE_LENGTH";
    /**
     * 所属厂商
     */
    public static final String GPS_TYPE = "GPS_TYPE";

    /**
     * 异常类型
     */
    public static final String EX_CODE = "EX_CODE";
    /**
     * 异常原因
     */
    public static final String EXCAUSE_CODE = "EXCAUSE_CODE";

    /************************************** 附件类型 *****************************************************/

    public static final String AFFIX_TYPE_BL = "BL";// 企业法人经营执照
    public static final String AFFIX_TYPE_RTP = "RTP";// 道路运输许可证
    public static final String AFFIX_TYPE_TRC = "TRC";// 税务登记证
    public static final String AFFIX_TYPE_OCC = "OCC";// 组织机构代码证
    public static final String AFFIX_TYPE_BAP = "BAP";// 银行开户许可证
    public static final String AFFIX_TYPE_OTHER = "OTHER";// 其他
    /**
     * 会员头像
     */
    public static final String AFFIX_HEAD_PIC = "HEAD_PIC";
    /**
     * 装车确认附件
     */
    public static final String AFFIX_HEAD_TH = "TH";
    /**
     * 回单
     */
    public static final String AFFIX_HEAD_HD = "HD";
    /**
     * 签收
     */
    public static final String AFFIX_HEAD_QS = "QS";


    /**
     * 货源
     */
    public static final String GOODS_YES = "1";// 竞价单状态 需要竞价
    public static final String SINGLEMODEL_1 = "1";// 下单方式1:最低价
    public static final String SINGLEMODEL_2 = "2";// 2:自主选择

    /************************************** 订单 *****************************************************/
    /**
     * 待报价
     */
    public static final String ORDER_1 = "01";
    /**
     * 待受理
     */
    public static final String ORDER_2 = "02";
    /**
     * 已受理
     */
    public static final String ORDER_3 = "03";
    /**
     * 已调度
     */
    public static final String ORDER_4 = "04";
    /**
     * 提货中
     */
    public static final String ORDER_5 = "05";
    /**
     * 提货完成
     */
    public static final String ORDER_6 = "06";
    /**
     * 送货中
     */
    public static final String ORDER_7 = "07";
    /**
     * 已签收
     */
    public static final String ORDER_8 = "08";
    /**
     * 已拒绝
     */
    public static final String ORDER_9 = "09";
    /**
     * 取消
     */
    public static final String ORDER_10 = "010";

    /************************************** 订单 *****************************************************/

    /**
     * 创建
     */
    public static final String EO_ORDER_CREATE = "00";
    public static final String EO_ORDER_CREATE_NAME = "订单创建";
    /**
     * 已受理
     */
    public static final String EO_ORDER_RECEIVE = "00";
    public static final String EO_ORDER_RECEIVE_NAME = "订单受理";
    /**
     * 已拒绝
     */
    public static final String EO_ORDER_REFUSE = "70";
    public static final String EO_ORDER_REFUSE_NAME = "订单拒绝";
    /**
     * 执行中
     */
    public static final String EO_ORDER_ACTION = "04";
    public static final String EO_ORDER_ACTION_NAME = "订单执行";
    /**
     * 已签收
     */
    public static final String EO_ORDER_SIGN = "60";
    public static final String EO_ORDER_SIGN_NAME = "订单签收";
    /**
     * 完成
     */
    public static final String EO_ORDER_COMPLATE = "60";
    public static final String EO_ORDER_COMPLATE_NAME = "订单完成";
    /**
     * 取消
     */
    public static final String EO_ORDER_CANNEL = "80";
    public static final String EO_ORDER_CANNEL_NAME = "订单取消";

    /**
     * 部分调度
     */
    public static final String EO_ORDER_PART_DISPATCH_STATUS_FIX = "10";
    /**
     * 完全调度
     */
    public static final String EO_ORDER_FULL_DISPATCH_STATUS_FIX = "20";
    public static final String EO_ORDER_FULL_DISPATCH_STATUS_FIX_NAME = "完全调度";

    /**
     * 部分装车
     */
    public static final String EO_ORDER_PART_LOADING_STATUS_FIX = "30";
    public static final String EO_ORDER_PART_LOADING_STATUS_FIX_NAME = "部分装车";

    /**
     * 完全装车
     */
    public static final String EO_ORDER_FULL_LOADING_STATUS_FIX = "40";
    public static final String EO_ORDER_FULL_LOADING_STATUS_FIX_NAME = "完全装车";

    /************************************** 运单 *****************************************************/

    /**
     * 已撤销
     */
    public static final String WAY_BILL_RETRACT = "00";
    /**
     * 已调度
     */
    public static final String WAY_BILL_DISPATCH = "01";
    /**
     * 已装车
     */
    public static final String WAY_BILL_LOADING = "02";
    /**
     * 已签收
     */
    public static final String WAY_BILL_SIGN = "03";
    /**
     * 完成
     */
    public static final String WAY_BILL_COMPLETE = "04";

    /**
     * 已调度中文
     */
    public static final String WAY_BILL_DISPATCH_CN = "已调度";
    /**
     * 已装车中文
     */
    public static final String WAY_BILL_LOADING_CN = "已装车";
    /**
     * 已签收中文
     */
    public static final String WAY_BILL_SIGN_CN = "已签收";
    /**
     * 完成中文
     */
    public static final String WAY_BILL_COMPLETE_CN = "完成";

    /**
     * SINGLE_MODEL 单子来源公司
     */
    public static final String ORDER_GY = "03";
    /**
     * SINGLE_MODEL 单子来源公司
     */
    public static final String ORDER_SF = "04";
    /**
     * ordersource 单子来源平台
     */
    public static final String ORDER_SOURCE_JK = "JK";

    /**
     * 车源下单
     */
    public static final String ORDER_SINGLEMODEL_1 = "01";
    /**
     * 货源下单
     */
    public static final String ORDER_SINGLEMODEL_2 = "02";
    /**
     * 物流产品下单
     */
    public static final String ORDER_SINGLEMODEL_3 = "03";
    /**
     * 转包订单
     */
    public static final String ORDER_SINGLEMODEL_4 = "04";
    /**
     * 接口数据
     */
    public static final String ORDER_SINGLEMODEL_5 = "05";
    /**
     * 合同下单
     */
    public static final String ORDER_SINGLEMODEL_6 = "06";

    /************************************** 物流订单下单方式 *****************************************************/

    /**
     * 采销下单
     */
    public static final String ORDER_PLACE_TYPE_10 = "10";
    /**
     * 在线下单
     */
    public static final String ORDER_PLACE_TYPE_20 = "20";
    /**
     * Excel导入
     */
    public static final String ORDER_PLACE_TYPE_30 = "30";
    /**
     * 接口下单
     */
    public static final String ORDER_PLACE_TYPE_40 = "40";

    /**
     * 正常签收
     */
    public static final String ORDER_NORMAL_SIGN = "30";
    /**
     * 异常签收
     */
    public static final String ORDER_ABNORMAL_SIGN = "20";



    /**
     * 读取成功标志 1成功 2失败
     */
    public static final String SUCCESS_FLAG = "1";
    /**
     * 异常签收
     */
    public static final String FAIL_FALG = "2";


    /************************************** Edi数据类型 *****************************************************/


    /**
     * 待处理
     */
    public static final String CFLAG_PENDING = "10";

    /**
     * 处理中
     */
    public static final String CFLAG_HANDLE = "20";
    /**
     * 接收数据
     */
    public static final String CFLAG_RECEIVE = "30";

    /**
     * 接口数据同步成功
     */
    public static final String CFLAG_INTERFACE_SUCCESS = "30";

    /**
     * 业务数据同步成功
     */
    public static final String CFLAG_BUSINESS_SUCCESS = "60";

    /**
     * 接口数据同步失败
     */
    public static final String CFLAG_INTERFACE_FAIL = "93";

    /**
     * 业务数据同步失败
     */
    public static final String CFLAG_BUSINESS_FAIL = "96";



    /**
     * 未处理
     */
    public static final String CSTATUS_START = "10";

    /**
     * 已处理
     */
    public static final String CSTATUS_END = "30";


    /************************************** 反馈状态 ***********************************/

    /**
     * 签收未发送
     */
    public static final String ORDER_STATUS_YET = "10";

    /**
     * 签收已发送
     */
    public static final String ORDER_STATUS_SUCCESS = "20";

    /*************************** DISPATCH_TYPE 派车类型(dispatch:自运调度； consign:委外调度) **************************/

    /**
     * 自运调度
     */
    public static final String DISPATCH = "dispatch";

    /**
     * 委外调度
     */
    public static final String CONSIGN = "consign";



    /************************************** extSource ********************************************/

    /**
     * 数据来源 上游
     */
    public static final String ORDER_SOURCE_UP = "10";

    /**
     * 数据来源 下游
     */
    public static final String ORDER_SOURCE_DOWN = "20";


    /*************************** OWN_TYPE 所属类型(01:订单 02:运单) **************************/

    /**
     * 数据类型 订单
     */
    public static final String ORDER_SOURCE_ORDER = "01";

    /**
     * 数据类型 运单
     */
    public static final String ORDER_SOURCE_WAYBILL = "02";

    /*************************** OE_TYPE 所属类型(01:配送员 02:副驾) **************************/

    /**
     * 所属类型 配送员
     */
    public static final String DRIVER_SOURCE_01 = "01";

    /**
     * 所属类型 副驾
     */
    public static final String DRIVER_SOURCE_02 = "02";


    /*************************** SINGLE_MODEL 接口类型订单：ORDER 运单：WAYBILL 订单+运单：OrderAndWayBill **************************/

    /**
     * 接口类型 订单
     */
    public static final String SINGLE_MODEL_ORDER = "ORDER";

    /**
     * 接口类型 运单
     */
    public static final String SINGLE_MODEL_WAYBILL = "WAYBILL";

    /**
     * 接口类型 订单+运单
     */
    public static final String SINGLE_MODEL_ORDERANDWAYBILL = "OrderAndWayBill";


    /**
     * 货主下单号 code
     */
    public static final String S_ORDER_NO = "SO";

    /**
     * 运单号 code
     */
    public static final String S_WAYBILL_NO = "ST";

    /**
     * 调度单号 code
     */
    public static final String S_EC_NO = "A";

    /**
     * 销售单号
     */
    public static final String S_PURCHASE_NO = "PO";

    /**
     * 销售单号
     */
    public static final String S_DELIVERY_NO = "DO";

    /**
     * 订单创建
     */
    public static final String OPERATE_TYPE_01 = "01";
    public static final String OPERATE_TYPE_NAME_01 = "订单创建";

    /**
     * 订单报价
     */
    public static final String OPERATE_TYPE_02 = "02";
    public static final String OPERATE_TYPE_NAME_02 = "订单报价";

    /**
     * 拒绝报价
     */
    public static final String OPERATE_TYPE_03 = "03";
    public static final String OPERATE_TYPE_NAME_03 = "拒绝报价";

    /**
     * 同意报价
     */
    public static final String OPERATE_TYPE_04 = "04";
    public static final String OPERATE_TYPE_NAME_04 = "同意报价";

    /**
     * 驳回报价
     */
    public static final String OPERATE_TYPE_05 = "05";
    public static final String OPERATE_TYPE_NAME_05 = "驳回报价";

    /**
     * 重新报价
     */
    public static final String OPERATE_TYPE_06 = "06";
    public static final String OPERATE_TYPE_NAME_06 = "重新报价";

    /**
     * 订单调度
     */
    public static final String OPERATE_TYPE_07 = "07";
    public static final String OPERATE_TYPE_NAME_07 = "订单调度";

    /**
     * 订单转包
     */
    public static final String OPERATE_TYPE_08 = "08";
    public static final String OPERATE_TYPE_NAME_08 = "订单转包";

    /**
     * 订单改派
     */
    public static final String OPERATE_TYPE_09 = "09";
    public static final String OPERATE_TYPE_NAME_09 = "订单改派";

    /**
     * 提货通知
     */
    public static final String OPERATE_TYPE_10 = "10";
    public static final String OPERATE_TYPE_NAME_10 = "提货通知";

    /**
     * 装车确认
     */
    public static final String OPERATE_TYPE_11 = "11";
    public static final String OPERATE_TYPE_NAME_11 = "装车确认";

    /**
     * 送货通知
     */
    public static final String OPERATE_TYPE_12 = "12";
    public static final String OPERATE_TYPE_NAME_12 = "送货通知";

    /**
     * 签收
     */
    public static final String OPERATE_TYPE_13 = "13";
    public static final String OPERATE_TYPE_NAME_13 = "签收";

    /**
     * 回单上传
     */
    public static final String OPERATE_TYPE_14 = "14";
    public static final String OPERATE_TYPE_NAME_14 = "回单上传";

    /**
     * 异常登记
     */
    public static final String OPERATE_TYPE_15 = "15";
    public static final String OPERATE_TYPE_NAME_15 = "异常登记";

    /**
     * 订单评价
     */
    public static final String OPERATE_TYPE_16 = "16";
    public static final String OPERATE_TYPE_NAME_16 = "订单评价";

    /**
     * 订单完成
     */
    public static final String OPERATE_TYPE_17 = "17";
    public static final String OPERATE_TYPE_NAME_17 = "订单完成";

    /**
     * 已受理
     */
    public static final String OPERATE_TYPE_18 = "18";
    public static final String OPERATE_TYPE_NAME_18 = "已受理";

    /**
     * 已取消
     */
    public static final String OPERATE_TYPE_19 = "19";
    public static final String OPERATE_TYPE_NAME_19 = "已取消";

    /**
     * 接驳装车
     */
    public final static String OPERATE_TYPE_21 = "21";
    public final static String OPERATE_TYPE_NAME_21 = "接驳装车";
    /**
     * 接驳卸车
     */
    public final static String OPERATE_TYPE_22 = "22";
    public final static String OPERATE_TYPE_NAME_22 = "接驳卸车";

    /**
     * 运抵
     */
    public final static String OPERATE_TYPE_27 = "27";
    public final static String OPERATE_TYPE_NAME_27 = "运抵";
    /**
     * 其他路由状态
     */
    public final static String OPERATE_TYPE_220 = "220";
    public final static String OPERATE_TYPE_NAME_220 = "其他路由状态";

    /**
     * 在途反馈
     */
    public final static String OPERATE_TYPE_28 = "28";
    public final static String OPERATE_TYPE_NAME_28 = "在途反馈";

    /**
     * 收货确认
     */
    public final static String OPERATE_TYPE_29 = "29";
    public final static String OPERATE_TYPE_NAME_29 = "收货确认";

    /** ----------------------订单运单类型------------------- */
    /**
     * 订单
     */
    public static final String ORDER_TYPE_01 = "01";

    /**
     * 运单
     */
    public static final String ORDER_TYPE_02 = "02";

    /** ----------------------国药接口地址------------------- */
    /**
     * 省名称
     */
    public static final String PROVINCE = "province";

    /**
     * 市名称
     */
    public static final String CITY = "city";

    /**
     * 区域名称
     */
    public static final String AREA = "area";

    /**
     * 地址
     */
    public static final String ADDRESS = "address";

    /**
     * 操作类型(新增)
     */
    public static final String OPERATE_ADD = "0";
    /**
     * 操作类型(修改)
     */
    public static final String OPERATE_UPDATE = "1";
    /**
     * 订单来源(APP)
     */
    public static final String ORDER_SOURCE_APP = "APP";
    /**
     * 订单来源(PC)
     */
    public static final String ORDER_SOURCE_PC = "PC";

    /** ------------------订单运单执行信息操作类型------------------- */
    /**
     * 已撤销
     */
    public final static String OPERATE_TYPE_20 = "20";
    public final static String OPERATE_TYPE_NAME_20 = "已撤销";

    /**
     * 国药需要下发到康程承运商公司名称
     */
    public final static String HNKC_OFFICE_NAME = "湖南省康程物流有限责任公司";

    /**
     * 车辆状态---未交车
     */
    public static final String NOT_RETURN = "N";
    /**
     * 车辆状态---交车
     */
    public static final String YES_RETURN = "Y";

    /**
     * 上报运单
     */
    public static final String REPORTWAYBILL = "ReportWayBill";

    /**
     * 获取令牌
     */
    public static final String GENERATETOKEN = "GenerateToken";

    /**
     * 物流单号前缀
     */
    public static final String LO = "LO";

    /** ------------------物流订单状态------------------- */
    /**
     * 已创建
     */
    public static final Integer LOGISTICS_ORDER_CREATE_CODE = 00;
    public static final String LOGISTICS_ORDER_CREATE_NAME = "已创建";
    /**
     * 已下单
     */
    public static final Integer LOGISTICS_ORDER_SUBMITED_CODE = 10;
    public static final String LOGISTICS_ORDER_SUBMITED_NAME = "已下单";
    /**
     * 待执行
     */
    public static final Integer LOGISTICS_ORDER_PENDINGEXECUTION_CODE = 20;
    public static final String LOGISTICS_ORDER_PENDINGEXECUTION_NAME = "待执行";
    /**
     * 执行中
     */
    public static final Integer LOGISTICS_ORDER_EXECUTING_CODE = 30;
    public static final String LOGISTICS_ORDER_EXECUTING_NAME = "执行中";

    /** ------------------物流订单里程碑状态------------------- */

    /**
     * 创建
     */
    public static final Integer LOGISTICS_ORDER_TRACK_CREATED_CODE = 10;
    public static final String LOGISTICS_ORDER_TRACK_CREATED_NAME = "已创建";

    /**
     * 已下单
     */
    public static final Integer LOGISTICS_ORDER_TRACK_SUBMITED_CODE = 20;
    public static final String LOGISTICS_ORDER_TRACK_SUBMITED_NAME = "已下单";

    /**
     * 待执行
     */
    public static final Integer LOGISTICS_ORDER_TRACK_PENDINGEXECUTION_CODE = 30;
    public static final String LOGISTICS_ORDER_TRACK_PENDINGEXECUTION_NAME = "待执行";

    /**
     * 执行中
     */
    public static final Integer LOGISTICS_ORDER_TRACK_EXCUTE_CODE = 40;
    public static final String LOGISTICS_ORDER_TRACK_EXCUTE_NAME = "执行中";

    /**
     * 取消
     */
    public static final Integer LOGISTICS_ORDER_TRACK_CANCEL_CODE = 70;
    public static final String LOGISTICS_ORDER_TRACK_CANCEL_NAME = "取消";

    /** ------------------物流订单路由状态------------------- */

    /**
     * 创建
     */
    public static final Integer LOGISTICS_ORDER_EVENT_CREATED_CODE = 10;
    public static final String LOGISTICS_ORDER_EVENT_CREATED_NAME = "创建";

    /**
     * 已下单
     */
    public static final Integer LOGISTICS_ORDER_EVENT_SUBMITED_CODE = 20;
    public static final String LOGISTICS_ORDER_EVENT_SUBMITED_NAME = "已下单";

    /**
     * 取消下单
     */
    public static final Integer LOGISTICS_ORDER_EVENT_CANCEL_CODE = 30;
    public static final String LOGISTICS_ORDER_EVENT_CANCEL_NAME = "取消下单";

    /**
     * 生效
     */
    public static final Integer LOGISTICS_ORDER_EVENT_EFFECTED_CODE = 50;
    public static final String LOGISTICS_ORDER_EVENT_EFFECTED_NAME = "生效";

    /**
     * 转出
     */
    public static final Integer LOGISTICS_ORDER_EVENT_SUB_CODE = 74;
    public static final String LOGISTICS_ORDER_EVENT_SUB_NAME = "转出";

    /**
     * 调度
     */
    public static final Integer LOGISTICS_ORDER_EVENT_DISPATCH_CODE = 80;
    public static final String LOGISTICS_ORDER_EVENT_DISPATCH_NAME = "调度";

    /**
     * 提货通知
     */
    public static final Integer LOGISTICS_ORDER_EVENT_EXTRACT_NOTICE_CODE = 130;
    public static final String LOGISTICS_ORDER_EVENT_EXTRACT_NOTICE_NAME = "提货通知";

    /**
     * 装车确认
     */
    public static final Integer LOGISTICS_ORDER_EVENT_PICKUP_CODE = 140;
    public static final String LOGISTICS_ORDER_EVENT_PICKUP_NAME = "装车确认";

    /**
     * 接驳装车
     */
    public static final Integer LOGISTICS_ORDER_EVENT_FEEDER_LOADING_CODE = 141;
    public static final String LOGISTICS_ORDER_EVENT_FEEDER_LOADING_NAME = "接驳装车";

    /**
     * 接驳卸车
     */
    public static final Integer LOGISTICS_ORDER_EVENT_FEEDER_TRUCK_CODE = 142;
    public static final String LOGISTICS_ORDER_EVENT_FEEDER_TRUCK_NAME = "接驳卸车";

    /**
     * 在途反馈
     */
    public static final Integer LOGISTICS_ORDER_EVENT_FEEDER_EXCEPTION_CODE = 143;
    public static final String LOGISTICS_ORDER_EVENT_FEEDER_EXCEPTION_NAME = "在途反馈";

    /**
     * 送货通知
     */
    public static final Integer LOGISTICS_ORDER_EVENT_DELIVERY_NOTICE_CODE = 150;
    public static final String LOGISTICS_ORDER_EVENT_DELIVERY_NOTICE_NAME = "送货通知";

    /**
     * 签收
     */
    public static final Integer LOGISTICS_ORDER_EVENT_SIGN_CODE = 160;
    public static final String LOGISTICS_ORDER_EVENT_SIGN_NAME = "签收";

    /**
     * 异常登记
     */
    public static final Integer LOGISTICS_ORDER_EVENT_EXCEPTION_REGISTER_CODE = 170;
    public static final String LOGISTICS_ORDER_EVENT_EXCEPTION_REGISTER_NAME = "异常登记";

    /**
     * 回单上传
     */
    public static final Integer LOGISTICS_ORDER_EVENT_RECEIPT_UPLOAD_CODE = 190;
    public static final String LOGISTICS_ORDER_EVENT_RECEIPT_UPLOAD_NAME = "回单上传";

    /**
     * 取消
     */
    public static final Integer LOGISTICS_ORDER_EVENT_ORDERCANCEL_CODE = 250;
    public static final String LOGISTICS_ORDER_EVENT_ORDERCANCEL_NAME = "取消";

    /**
     * 收货确认
     */
    public static final Integer LOGISTICS_ORDER_EVENT_CONFIRMATION_CODE = 205;
    public static final String LOGISTICS_ORDER_EVENT_CONFIRMATION_NAME = "收货确认";

    /**
     * 其他路由状态
     */
    public static final Integer LOGISTICS_ORDER_EVENT_OTHERS_CODE = 255;
    public static final String LOGISTICS_ORDER_EVENT_OTHERS_NAME = "其他路由状态";

    /************************************** 物流订单 *****************************************************/

    /**
     * 取消
     */
    public static final Integer EO_LOGISTICS_ORDER_CANCEL = 60;
    public static final String EO_LOGISTICS_ORDER_CANCEL_NAME = "取消";

    /** ------------------物流订单状态变化------------------- */

    /**
     * 创建
     */
    public static final Integer LOGISTICS_ORDER_STATUS_CREATED = 10;
    public static final String LOGISTICS_ORDER_STATUS_CREATED_NAME = "创建";

    /**
     * 已下单
     */
    public static final Integer LOGISTICS_ORDER_STATUS_SUBMITED = 20;
    public static final String LOGISTICS_ORDER_STATUS_SUBMITED_NAME = "已下单";

    /**
     * 部分调度
     */
    public static final Integer LOGISTICS_ORDER_STATUS_PARTDISPATCH = 30;
    public static final String LOGISTICS_ORDER_STATUS_PARTDISPATCH_NAME = "部分调度";

    /**
     * 完全调度
     */
    public static final Integer LOGISTICS_ORDER_STATUS_ALLDISPATCH = 40;
    public static final String LOGISTICS_ORDER_STATUS_ALLDISPATCH_NAME = "完全调度";

    /**
     * 部分装车
     */
    public static final Integer LOGISTICS_ORDER_STATUS_ENTRUCKING = 70;
    public static final String LOGISTICS_ORDER_STATUS_ENTRUCKING_NAME = "部分装车";

    /**
     * 完全装车
     */
    public static final Integer LOGISTICS_ORDER_STATUS_ALLPICKUP = 80;
    public static final String LOGISTICS_ORDER_STATUS_ALLPICKUP_NAME = "完全装车";

    /**
     * 完全签收
     */
    public static final Integer LOGISTICS_ORDER_STATUS_SIGN = 100;
    public static final String LOGISTICS_ORDER_STATUS_SIGN_NAME = "完全签收";

    /**
     * 取消
     */
    public static final Integer LOGISTICS_ORDER_STATUS_CANCEL = 130;
    public static final String LOGISTICS_ORDER_STATUS_CANCEL_NAME = "取消";

    /** ------------------承运订单类型------------------- */
    /**
     * 运输出库
     */
    public static final Integer CARRIER_TYPE_OUTBOUND = 1;
    /**
     * 运输入库
     */
    public static final Integer CARRIER_TYPE_INBOUND = 2;
    /**
     * 运输订单
     */
    public static final Integer CARRIER_TYPE_ORDER = 3;
    /**
     * 出库订单
     */
    public static final Integer CARRIER_TYPE_OUTBOUND_ORDER = 4;
    /**
     * 入库订单
     */
    public static final Integer CARRIER_TYPE_INBOUND_ORDER = 5;

    /** ------------------运输条件------------------- */
    /**
     * 超低温物流
     */
    public static final String TRANSPORTATION_CODE_10 = "10";
    /**
     * 冷冻物流
     */
    public static final String TRANSPORTATION_CODE_20 = "20";
    /**
     * 冰温物流
     */
    public static final String TRANSPORTATION_CODE_30 = "30";
    /**
     * 冷藏物流
     */
    public static final String TRANSPORTATION_CODE_40 = "40";
    /**
     * 控制常温物流
     */
    public static final String TRANSPORTATION_CODE_50 = "50";

    /**
     * 标准层订单接收接口
     */
    public static final String ORDER_RECEIVE = "OrderReceive";

    /**
     * 标准层订单取消接口
     */
    public static final String ORDER_CANCEL = "OrderCancel";
    // 主单
    public static final String ORDER_CANCEL_ORDER_TYPE_MAIN = "Main";
    // 派车单
    public static final String ORDER_CANCEL_ORDER_TYPE_DISPATCH = "Dispatch";
    // 委外
    public static final String ORDER_CANCEL_ORDER_TYPE_CONSIGN = "Consign";


    /**
     * 标准层订单取消反馈接口
     */
    public static final String ORDER_CANCEL_FEEDBACK = "OrderCancelFeedback";

    /**
     * 标准层装车确认接收接口
     */
    public static final String LOADING_CONFIRM = "loadingConfirm";

    /**
     * TMS装车确认接收接口
     */
    public static final String ORDER_CAR_LOADED = "OrderCarLoaded";

    /**
     * 采购订单状态
     */
    public static final String PSC_ORDER_STATUS_CREATE = "01";// 已创建
    public static final String PSC_ORDER_TRACK_REMARK_CREATE = "您的订单已创建。";// 已创建信息

    /**
     * 采购订单 事件类型
     */
    public static final String PSC_EVENT_TYPE_PURCHASE = "01";// 采购
    /**
     * 采购订单 事件代码
     */
    public static final String PSC_EVENT_CODE_CREATE = "01";// 已创建
    /**
     * 采购订单 事件名称
     */
    public static final String PSC_EVENT_NAME_CREATE = "订单创建";// 已创建
    public static final String PSC_EVENT_NAME_CANCEL = "订单取消";// 已取消
    /**
     * 采购订单 事件名称
     */
    public static final String PSC_EVENT_REMARK_CREATE = "您的订单已创建。";// 已创建
    public static final String PSC_EVENT_REMARK_CANCEL = "您的订单已取消。";// 已创建

    /**
     * sku接收接口
     */
    public static final String SKU_RECEIVE = "SkuReceive";

    /**
     * 提货异常
     */
    public static final String IS_PICKUP_EXCEPTION = "1";

    /**
     * 订单号存放redis
     */
    public static final String ORDER_NOS = "ORDERRECEIVE_ORDER_NOS";

    /** 文件 上传路径 **/
    public static String uploadPath = "/JLT/log/interfaces/";

    private InterfacesConstant() {

    }

}
