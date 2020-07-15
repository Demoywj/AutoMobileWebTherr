package business.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.dao.ActivityNoticeDAO;
import business.dao.AdminUserDAO;
import business.dao.AdminUserRoleDAO;
import business.dao.AnnouncementDAO;
import business.dao.ArticleDAO;
import business.dao.CarBrandDAO;
import business.dao.CarConfigDAO;
import business.dao.CarTypeDAO;
import business.dao.PartifoDAO;
import business.dao.ProColumnDAO;
import business.dao.ProContentDAO;
import business.dao.ProProjectDAO;
import business.dao.ReviewDAO;
import business.dao.RoleSystemDAO;
import business.dao.ScoreDAO;
import business.dao.ServiceNotificationDAO;
import business.dao.SubscribeDAO;
import business.dao.SystemLogDAO;
import business.dao.SystemLogViewDAO;
import business.dao.SystemModelDAO;
import business.dao.UserCarIfoDAO;
import business.dao.UserDAO;


public class DAOFactory {
	private static ApplicationContext ctx = null;
			
	static{
		ctx = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
	}
	
	/**
	 * 得到一个用于活动通知管理模块的ActivityNoticeDAO实现类对象
	 * @return ActivityNoticeDAO
	 */
	public static ActivityNoticeDAO getActivityNoticeDAO(){
		return (ActivityNoticeDAO)ctx.getBean("activitynoticedao");
	}

	/**
	 * 得到一个用于管理员业务操作的AdminUserDAO实现类对象
	 * @return AdminUserDAO
	 */
	public static AdminUserDAO getAdminUserDAO(){
		return (AdminUserDAO)ctx.getBean("adminuserdao");
	}
	
	
	/**
	 * 得到一个用于管理员角色业务操作的AdminUserRoleDAO实现类对象
	 * @return AdminUserRoleDAO
	 */
	public static AdminUserRoleDAO getAdminRoleDAO(){
		return (AdminUserRoleDAO)ctx.getBean("adminuserroledao");
	}
	
	
	
	/**
	 * 得到一个公告管理操作的AnnouncementDAO实现类对象
	 * @return AnnouncementDAO
	 */
	public static AnnouncementDAO getAnnouncementDAO(){
		return (AnnouncementDAO)ctx.getBean("announcementdao");
	}
	
	
	/**
	 * 得到一个文章管理操作的ArticleDAO实现类对象
	 * @return ArticleDAO
	 */
	public static ArticleDAO getArticleDAO(){
		return (ArticleDAO)ctx.getBean("articledao");
	}
	
	/**
	 * 得到一个车辆品牌管理操作的CarBrandDAO实现类对象
	 * @return CarBrandDAO
	 */
	public static CarBrandDAO getCarBrandDAO(){
		return (CarBrandDAO)ctx.getBean("carBranddao");
	}
	
	
	/**
	 * 得到一个车辆配置管理操作的CarConfigDAO实现类对象
	 * @return CarConfigDAO
	 */
	public static CarConfigDAO getCarConfigDAO(){
		return (CarConfigDAO)ctx.getBean("carconfigdao");
	}
	
	
	/**
	 * 得到一个车辆类型管理操作的CarTypeDAO实现类对象
	 * @return CarTypeDAO
	 */
	public static CarTypeDAO getCarTypeDAO(){
		return (CarTypeDAO)ctx.getBean("cartypedao");
	}
	
	/**
	 * 得到一个车辆配件管理操作的PartifoDAO实现类对象
	 * @return PartifoDAO
	 */
	public static PartifoDAO getPartifoDAO(){
		return (PartifoDAO)ctx.getBean("partifodao");
	}
	
	/**
	 * 得到一个车辆类型管理操作的ProColumnDAO实现类对象
	 * @return ProColumnDAO
	 */
	public static ProColumnDAO getProColumnDAO(){
		return (ProColumnDAO)ctx.getBean("procolumndao");
	}
	
	
	/**
	 * 得到一个车辆产品管理操作的ProContentDAO实现类对象
	 * @return ProContentDAO
	 */
	public static ProContentDAO getProContentDAO(){
		return (ProContentDAO)ctx.getBean("procontentdao");
	}
	
	
	/**
	 * 得到一个维保项目管理操作的ProProjectDAO实现类对象
	 * @return ProProjectDAO
	 */
	public static ProProjectDAO getProProjectDAO(){
		return (ProProjectDAO)ctx.getBean("proprojectdao");
	}
	
	
	/**
	 * 得到一个评论管理操作的ReviewDAO实现类对象
	 * @return ReviewDAO
	 */
	public static ReviewDAO getReviewDAO(){
		return (ReviewDAO)ctx.getBean("reviewdao");
	}
	
	/**
	 * 返回一个用于对日志操作的RoleSystemDAO对象
	 * @return RoleSystemDAO
	 */
	public static RoleSystemDAO getRoleSystemDAO(){
		return (RoleSystemDAO)ctx.getBean("rolesystemdao");
	}
	
	
	/**
	 * 返回一个用于服务反馈评分操作的ScoreDAO对象
	 * @return ScoreDAO
	 */
	public static ScoreDAO getScoreDAO(){
		return (ScoreDAO)ctx.getBean("scoredao");
	}
	
	/**
	 * 返回一个用于服务通知操作的ServiceNotificationDAO对象
	 * @return ServiceNotificationDAO
	 */
	public static ServiceNotificationDAO getServiceNotificationDAO(){
		return (ServiceNotificationDAO)ctx.getBean("servicenotificationdao");
	}
	
	/**
	 * 返回一个用于预约信息操作的SubscribeDAO对象
	 * @return SubscribeDAO
	 */
	public static SubscribeDAO getSubscribeDAOI(){
		return (SubscribeDAO)ctx.getBean("subscribedao");
	}
	
	/**
	 * 得到一个用于系统菜单管理业务操作的SystemLogDAO实现类对象
	 * @return SystemLogDAO
	 */
	public static SystemLogDAO getSystemLogDAO(){
		return (SystemLogDAO)ctx.getBean("systemlogdao");
	
	}
	
	/**
	 * 返回一个用于对日志操作的SystemLogViewDAO对象
	 * @return SystemLogViewDAO
	 */
	public static SystemLogViewDAO getSystemLogViewDAO(){
		return (SystemLogViewDAO)ctx.getBean("systemlogdaoviewdao");
	}
	
	
	/**
	 * 得到一个用于系统菜单管理业务操作的SystemModelDAO实现类对象
	 * @return SystemModelDAO
	 */
	public static SystemModelDAO getSystemModelDAO(){
		return (SystemModelDAO)ctx.getBean("systemmodeldao");
	}
	
	

	/**
	 * 得到一个用于车辆车主车辆信息管理业务操作的UserCarIfoDAO实现类对象
	 * @return UserCarIfoDAO
	 */
	public static UserCarIfoDAO getUserCarIfoDAO(){
		return (UserCarIfoDAO)ctx.getBean("usercarifodao");
	}
	

	/**
	 * 得到一个用于车主信息管理业务操作的UserDAO实现类对象
	 * @return UserDAO
	 */
	public static UserDAO getUserDAO(){
		return (UserDAO)ctx.getBean("userdao");
	}
	

	
	
	
	
	

	
}
