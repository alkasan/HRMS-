package insankaynaklari.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import insankaynaklari.hrms.business.abstracts.JobTitlesService;
import insankaynaklari.hrms.dataAccess.abstracts.JobTitlesDao;
import insankaynaklari.hrms.entities.concretes.JobTitles;

public class JobTitlesManager implements JobTitlesService {

	private JobTitlesDao jobTitleDao;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	
	@Override
	public List<JobTitles> getAll() {
		
		return jobTitleDao.findAll();
	}

}
