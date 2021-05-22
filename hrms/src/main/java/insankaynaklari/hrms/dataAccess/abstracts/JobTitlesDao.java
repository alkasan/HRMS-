package insankaynaklari.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import insankaynaklari.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer>{

}
