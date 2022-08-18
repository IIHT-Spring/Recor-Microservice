package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	
	
	//dummy list of records
	List<Record> list = List.of(
			new Record(1L,"Tata@gmail.com","Tata Motors", 1311L),
			new Record(2L,"mahindra@gmail.com","Mahindra & Mahiindra", 1311L),
			new Record(3L,"ctc@gmail.com","Ctc", 1312L),
			new Record(4L,"TCS@gmail.com","TCS", 1312L),
			new Record(5L,"Accenture@gmail.com","Accenture", 1313L),
			new Record(6L,"lt@gmail.com","L&T", 1314L),
			new Record(7L,"JBL@gmail.com","JBL", 1315L),
			new Record(8L,"Infosys@gmail.com","Infosys", 1316L),
			new Record(9L,"TM@gmail.com","Tech Mahindra", 1317L),
			new Record(10L,"Merc@gmail.com","MErcedes", 1318L),
			new Record(10L,"Suzukiauto@gmail.com","Suzuki", 1319L)
			
			);

	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		// TODO Auto-generated method stub
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
