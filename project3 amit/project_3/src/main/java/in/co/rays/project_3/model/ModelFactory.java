package in.co.rays.project_3.model;
import java.util.HashMap;
import java.util.ResourceBundle;

import in.co.rays.project_3.exception.DatabaseException;

/**
 * ModelFactory decides which model implementation run
 * 
 * @author Amit joshi 
 *
 */
public final class ModelFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.project_3.bundle.system");
	private static final String DATABASE = rb.getString("DATABASE");
	private static ModelFactory mFactory = null;
	private static HashMap modelCache = new HashMap();
	/**
	 * private constractor of ModelFactory
	 */
	
	private ModelFactory() {

	}
	/**
	 * give a instance of ModelFactory
	 * @return ModelFactory
	 */
	
	public static ModelFactory getInstance() {
		if (mFactory == null) {
			mFactory = new ModelFactory();
		}
		return mFactory;
	}
	/**
	 * give a instance of MarksheetModel
	 * @return MarksheetModelInt
	 */
	
	public MarksheetModelInt getMarksheetModel() {
		MarksheetModelInt marksheetModel = (MarksheetModelInt) modelCache.get("marksheetModel");
		if (marksheetModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				marksheetModel = new MarksheetModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				marksheetModel = new MarksheetModelJDBCImpl();
			}
			modelCache.put("marksheetModel", marksheetModel);
		}
		return marksheetModel;
	}
	/**
	 * give a instance of CollegeModel
	 * @return CollegeModelInt
	 */
	
	public CollegeModelInt getCollegeModel() {
		CollegeModelInt collegeModel = (CollegeModelInt) modelCache.get("collegeModel");
		if (collegeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				collegeModel = new CollegeModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				collegeModel = new CollegeModelJDBCImpl();
			}
			modelCache.put("collegeModel", collegeModel);
		}
		return collegeModel;
	}
	/**
	 * give a instance of RoleModel
	 * @return RoleModelInt
	 */
	
	public RoleModelInt getRoleModel() {
		RoleModelInt roleModel = (RoleModelInt) modelCache.get("roleModel");
		if (roleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				roleModel = new RoleModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				roleModel = new RoleModelJDBCImpl();
			}
			modelCache.put("roleModel", roleModel);
		}
		return roleModel;
	}
	/**
	 * give a instance of UserModel
	 * @return UserModelInt
	 */
	
	public UserModelInt getUserModel() {

		UserModelInt userModel = (UserModelInt) modelCache.get("userModel");
		if (userModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				userModel = new UserModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				userModel = new UserModelJDBCImpl();
			}
			modelCache.put("userModel", userModel);
		}

		return userModel;
	}
	/**
	 * give a instance of StudentModel
	 * @return StudentModelInt
	 */
	
	public StudentModelInt getStudentModel() { 
		StudentModelInt studentModel = (StudentModelInt) modelCache.get("studentModel");
		if (studentModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				studentModel = new StudentModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				studentModel = new StudentModelJDBCImpl();
			}
			modelCache.put("studentModel", studentModel);
		}

		return studentModel;
	}
	/**
	 * give a instance of CourseModel
	 * @return CourseModelInt
	 */
	
	public CourseModelInt getCourseModel() {
		CourseModelInt courseModel = (CourseModelInt) modelCache.get("courseModel");
		if (courseModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				courseModel = new CourseModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				courseModel = new CourseModelJDBCImpl();
			}
			modelCache.put("courseModel", courseModel);
		}

		return courseModel;
	}
	/**
	 * give a instance of TimetableModel
	 * @return TimetableModelInt
	 */
	
	public TimeTableModelInt getTimetableModel() {

		TimeTableModelInt timetableModel = (TimeTableModelInt) modelCache.get("timetableModel");

		if (timetableModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				timetableModel = new TimeTableModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				timetableModel = new TimeTableModelJDBCImpl();
			}
			modelCache.put("timetableModel", timetableModel);
		}

		return timetableModel;
	}
	/**
	 * give a instance of SubjectModel
	 * @return SubjectModelInt
	 */

	public SubjectModelInt getSubjectModel() {
		SubjectModelInt subjectModel = (SubjectModelInt) modelCache.get("subjectModel");
		if (subjectModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				subjectModel = new SubjectModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				subjectModel = new SubjectModelJDBCImpl();
			}
			modelCache.put("subjectModel", subjectModel);
		}

		return subjectModel;
	}
	/**
	 * give a instance of FacultyModel
	 * @return FacultyModelInt
	 */

	public FacultyModelInt getFacultyModel() {
		FacultyModelInt facultyModel = (FacultyModelInt) modelCache.get("facultyModel");
		if (facultyModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				facultyModel = new FacultyModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				facultyModel = new FacultyModelJDBCImpl();
			}
			modelCache.put("facultyModel", facultyModel);
		}

		return facultyModel;
	}
}


